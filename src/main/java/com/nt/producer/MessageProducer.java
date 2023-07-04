package com.nt.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
public class MessageProducer {

	@Autowired
	private KafkaTemplate<String, String> template; 
	
	@Value("${topic.name}")
	private String topicName;
	
	public String messageSend(String msg) {
		template.send(topicName, msg);
		return "message sent!";
	}
}
