package scratch.to_services_module.services.impl;

import org.springframework.data.annotation.Reference;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import scratch.to_services_module.models.Roles;
import scratch.to_services_module.models.Users;
import scratch.to_services_module.repository.UserRepository;
import scratch.to_services_module.services.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Reference
    private UserRepository userRepository;

    @Override
    public Users findByUsername(String username) {
        Users userByUsername = userRepository.findByName(username);
        return userByUsername;
    }

    @Override
    public Roles findByRole(String name) {
        Roles byRole = userRepository.findByRole(name);
        return byRole;
    }
}
