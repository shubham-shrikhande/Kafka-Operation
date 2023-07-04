package com.nt.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.nt.producer.StoreMessage;

@Component
public class MessageConsumer {

	@Autowired
	private StoreMessage store;
	
	@KafkaListener(topics = "${topic.name}",groupId = "grp1")
	public void recieveMessage(String msg) {
		store.storemsg(msg);
	}
}
