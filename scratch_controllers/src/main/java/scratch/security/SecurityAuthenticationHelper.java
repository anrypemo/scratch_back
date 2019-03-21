package scratch.security;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
public class SecurityAuthenticationHelper {

    public User getCurrentUser() {
        Authentication authentication = getAuthentication();

        if (authentication == null) {
            return null;
        }

        Object user = authentication.getPrincipal();
        if (user instanceof String) {
            return null;
        } else {
            return (User) user;
        }
    }

    private Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

}
