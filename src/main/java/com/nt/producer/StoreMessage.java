package com.nt.producer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StoreMessage {

	private List<String> list=new ArrayList<String>();
	
	public void storemsg(String msg) {
		list.add(msg);
	}
	
	public String getmessages() {
		return list.toString();
	}
	
}
