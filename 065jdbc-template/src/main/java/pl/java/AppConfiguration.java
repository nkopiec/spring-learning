package pl.java;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

@Configuration
@ComponentScan(basePackages = "pl.java")
public class AppConfiguration {

	@Bean
	public DataSource dataSource() {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setDatabaseName("mojabaza");
		dataSource.setServerName("localhost");
		dataSource.setUser("tutorial");
		dataSource.setPassword("password");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
}
