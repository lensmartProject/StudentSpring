package com.prabhat.app.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prabhat.app.topics.topics;

@Service
public class topicService {
	
	List<topics> Topics=new ArrayList<>(Arrays.asList(
			
			new topics("JAVA","PRABHAT","MUNGER"),
			new topics("C","HARSH","RANCHI"),
			new topics("CPP","RAHL","PATNA")
			));
	
	public List<topics> getAllTopic(){
		return Topics;
	}
	
	public topics getTopicByID(String id) {
		return Topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(topics topic) {
		Topics.add(topic);
		// TODO Auto-generated method stub
		
	}

	public void UpdateTopic(String id, topics topic) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<Topics.size();i++) {
			topics t=Topics.get(i);
			if(t.getId().equals(id)) {
				Topics.set(i, topic);
				return;
			}
		}
		
	}

}
