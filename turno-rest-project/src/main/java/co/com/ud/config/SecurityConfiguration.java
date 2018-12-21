package co.com.ud.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
		.authoritiesByUsernameQuery("SELECT us.username, roles.role FROM ROLE_USER roles, users us WHERE roles.user_id = us.id and us.username = ? ")
		.usersByUsernameQuery("select username , password, 1 from users where username = ? ");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()                      // it indicate basic authentication is requires
                .and()
                .authorizeRequests()
				.antMatchers( "/index").permitAll() // /index will be accessible directly, no need of any authentication
                .anyRequest().authenticated();    // it's indicate all request will be secure
        http.csrf().disable();
    }
	
}
