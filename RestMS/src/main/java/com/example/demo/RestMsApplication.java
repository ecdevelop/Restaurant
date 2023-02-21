package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bean.RestBean;
import com.example.demo.dao.*;


@SpringBootApplication
public class RestMsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RestMsApplication.class, args);
	}
	
	@Autowired
	private RestDAO restDao;

	@Override
	public void run(String... args) throws Exception {
		this.restDao.save(new RestBean(1,"KFC","FastFood"));
		this.restDao.save(new RestBean(2,"Mcdonald's","FastFood"));
		this.restDao.save(new RestBean(3,"WolfGang","SteakHouse"));
		this.restDao.save(new RestBean(4,"Sambokojin","Buffet"));
		this.restDao.save(new RestBean(5,"Wendy's","FastFood"));
	}

}
