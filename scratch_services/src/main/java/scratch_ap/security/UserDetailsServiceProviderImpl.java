package scratch_ap.security;

import scratch_ap.models.Authority;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserDetailsServiceProviderImpl implements UserDetailsServiceProvider {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public UserDetails provide(String username) throws UsernameNotFoundException {
        if (Objects.nonNull(username)) {
            logger.info("Providing user details for {}", username);

            //temp block starts
            User user = null;
            if ("test".equals(username)) {
                user = new User(username, "test123", AuthorityUtils.createAuthorityList(Authority.USER.getAuth()));
            }
            //temp block ends

            logger.info("Something found for {}", username);

            return user;
        }
        return null;
    }

}
