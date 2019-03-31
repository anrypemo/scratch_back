package scratch.to_services_module.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import scratch.to_services_module.models.Roles;
import scratch.to_services_module.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    @Query("select user from Users user where user.username = :username")
    Users findByName(@Param("username") String username);

    @Query("select role from Roles role where role.name = :name")
    Roles findByRole(@Param("name") String name);
}
