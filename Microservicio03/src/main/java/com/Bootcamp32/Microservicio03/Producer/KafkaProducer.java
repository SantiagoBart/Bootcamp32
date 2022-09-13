package com.Bootcamp32.Microservicio03.Producer;

import org.springframework.beans.factory.annotation.Qualifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
	private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
	private final KafkaTemplate<String, String> template;
	
	public KafkaProducer(@Qualifier("kafkaTemplate") KafkaTemplate<String, String> kafkaTemplate)
	{
		this.template = kafkaTemplate;
	}
	
	public void sendMessage(String message)
	{
		logger.info("Producer Message {}", message);
		this.template.send("Topic-Micro03", message);
	}
}
