package com.kafka.example.twitter4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.example.model.User;
import com.kafka.example.stream.ProducerController;

import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;

@SpringBootApplication
@ComponentScan(basePackageClasses = ProducerController.class)
public class Twitter4jApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(Twitter4jApplication.class, args);
	}

}
