package scratch.services.repository;

import scratch.services.models.Roles;
import scratch.services.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    @Query("select user from Users user where user.username = :username")
    Users findByName(@Param("username") String username);

    @Query("select role from Roles role where role.name = :name")
    Roles findByRole(@Param("name") String name);
}
