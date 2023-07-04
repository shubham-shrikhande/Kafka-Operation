
package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.producer.MessageProducer;
import com.nt.producer.StoreMessage;

@RestController
public class KafkaController {

	@Autowired
	private MessageProducer producer;
	
	@Autowired
	private StoreMessage store;
	
	@GetMapping("/send/{msg}")
	public String sendMsg(@PathVariable String msg) {
		return producer.messageSend(msg);
	}
	
	@GetMapping("/allMsg")
	public String getAllMsg() {
		return store.getmessages();
	}
}
