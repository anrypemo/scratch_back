package scratch.to_services_module.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import scratch.to_services_module.models.Users;
import scratch.to_services_module.repository.UserRepository;
import scratch.to_services_module.services.UserService;

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
