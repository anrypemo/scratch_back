package scratch.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import scratch.models.Authority;

import java.util.Objects;

@Service
public class UserDetailsServiceProviderImpl implements UserDetailsServiceProvider {

    @Override
    public UserDetails provide(String username) throws UsernameNotFoundException {
        if (Objects.nonNull(username)) {
// TODO: 3/21/2019 Replace temp block while ORM will be ready
            //temp block starts
            User user = null;
                user = new User(username, "test123", AuthorityUtils.createAuthorityList(Authority.USER.getAuth()));
            //temp block ends

            return user;
        }
        return null;
    }

}
