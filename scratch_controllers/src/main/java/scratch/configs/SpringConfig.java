package scratch.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import scratch.security.SecurityConfig;

@Configuration
@ComponentScan(basePackages = "scratch")
@Import({SecurityConfig.class})
public class SpringConfig {
}
