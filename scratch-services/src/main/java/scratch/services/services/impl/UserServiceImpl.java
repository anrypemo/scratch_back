package scratch.services.services.impl;

import scratch.services.models.Users;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import scratch.services.repository.UserRepository;
import scratch.services.services.UserService;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public Users findByUsername(String username) {
        Users userByUsername = userRepository.findByName(username);
        return userByUsername;
    }
}
