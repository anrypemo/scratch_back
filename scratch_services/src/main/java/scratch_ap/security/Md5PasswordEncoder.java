package scratch_ap.security;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Md5PasswordEncoder implements PasswordEncoder {
    private final static String salt = "-salt-";

    @Override
    public String encode(CharSequence rawPassword) {
        return Hashing.md5().hashString(rawPassword + salt, Charsets.UTF_8).toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encode(rawPassword).equals(encodedPassword);
    }
}
