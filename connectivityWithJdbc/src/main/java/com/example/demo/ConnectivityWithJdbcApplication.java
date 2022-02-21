package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ConnectivityWithJdbcApplication implements CommandLineRunner{
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(ConnectivityWithJdbcApplication.class, args);
	}
	@Override
	public void run (String... args)throws Exception{
		// TODO Auto-generated method stub
		String sql = "select * from Car";
		List<Car1>student=jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Car1.class));
		
		student.forEach(System.out::println);
		
	
		
	}
	
 
}
