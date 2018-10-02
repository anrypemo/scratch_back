package scratch_ap.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import scratch_ap.security.SecurityConfig;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "scratch_ap")
@Import({SecurityConfig.class})
public class SpringConfig extends WebMvcConfigurerAdapter {
}
