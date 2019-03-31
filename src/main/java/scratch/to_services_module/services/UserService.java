package scratch.to_services_module.services;

import scratch.to_services_module.models.Roles;
import scratch.to_services_module.models.Users;

public interface UserService {

    Users findByUsername(String username);

    Roles findByRole(String name);
}
