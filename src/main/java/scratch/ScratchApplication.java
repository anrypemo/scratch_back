package scratch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import scratch.security.Md5PasswordEncoder;
import scratch.to_services_module.repository.UserRepository;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "scratch.to_services_module.repository")
public class ScratchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScratchApplication.class, args);
    }
}
