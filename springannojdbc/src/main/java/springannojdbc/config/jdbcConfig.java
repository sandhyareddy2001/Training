package springannojdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import springannojdbcDao.dao;

@Configuration
public class jdbcConfig {
	
	@Bean
	public DriverManagerDataSource getDriverManager() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/db");
		ds.setUsername("root");
		ds.setPassword("rps@12345");
		return ds;
		
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate template= new JdbcTemplate();
		template.setDataSource(getDriverManager());
		return template;
		
	}
	
	@Bean("dao")
	public dao getDao() {
		dao dao = new dao();
		dao.setTemplate(getJdbcTemplate());
		return dao;
		
	}
	

}
