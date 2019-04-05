package scratch.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import scratch.services.UserUiService;
import scratch.services.models.Users;
import scratch.services.repository.UserRepository;

@Repository
public class UserUiServiceImpl implements UserUiService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users getUserByUsername(String username) {
        return this.userRepository.findByName(username);
    }
}
