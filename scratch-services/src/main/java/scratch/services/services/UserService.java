package scratch.services.services;


import scratch.services.models.Users;

public interface UserService {

    Users findByUsername(String username);
}
