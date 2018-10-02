package scratch_ap.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsServiceProvider {

    UserDetails provide(String username) throws UsernameNotFoundException;
}

