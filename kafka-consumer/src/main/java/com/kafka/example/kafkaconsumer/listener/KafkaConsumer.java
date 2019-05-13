package com.kafka.example.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.example.kafkaconsumer.model.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics="Kafka_Example", groupId ="group_id")
	public void consume(String message) {
		System.out.println("Consumed msg :"+message);
	}
	
	@KafkaListener(topics="Kafka_JSON", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
	public void consumeJson(User user) {
		System.out.println("consumer 1 here"+user);
	}
	
	@KafkaListener(topics="Kafka_JSON", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
	public void consumeJsn(User user) {
		System.out.println("consumer 2 here"+user);
	}
	
	@KafkaListener(topics="Kafka_JSON", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
	public void consumeJsnn(User user) {
		System.out.println("consumer 3 here"+user);
	}
	
	
}
