package scratch.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.annotation.Resource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private UserDetailsService userDetailsServiceImpl;

    @Resource
    private Md5PasswordEncoder md5PasswordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(md5PasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
// TODO: 3/21/2019 fix config according to Angular
        http.authorizeRequests()
                .antMatchers("/*").permitAll()
                .and().formLogin()
                .usernameParameter("username") //login form
                .passwordParameter("password")//login form
                .defaultSuccessUrl("/info")
                .and().logout().logoutSuccessUrl("/login").permitAll()
                .and().csrf().disable();
    }
}