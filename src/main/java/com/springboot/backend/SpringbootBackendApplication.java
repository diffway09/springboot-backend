package com.springboot.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication  {
	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception{
//		String sql = "select * from eService$Appraise with(nolock)";
//		jdbcTemplate.query(sql,);
//	}
}
