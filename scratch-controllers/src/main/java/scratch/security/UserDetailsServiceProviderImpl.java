package scratch.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import scratch.services.models.Roles;
import scratch.services.models.Users;
import scratch.services.services.UserService;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceProviderImpl implements UserDetailsServiceProvider {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private UserService userService;

    @Override
    public UserDetails provide(String username) throws UsernameNotFoundException {
        if (Objects.nonNull(username)) {

            logger.info("Providing scratch.user details for {}", username);
            Users findUser = userService.findByUsername(username);

            if (findUser == null) {
                return null;
            }

            User user = new User(username, findUser.getPassword(), mapRolesToAuthorities(findUser.getRoles()));
            logger.info("Something found for {}", username);
            return user;
        }
        return null;
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Roles> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }
}
