package com.Bootcamp32.Microservicio02.KafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
	
	@KafkaListener(topics = "Topic-Micro03", groupId = "group_Id")
	public void consume(String message)	
	{
		logger.info("Consuming Message: {}", message);
	}
}
