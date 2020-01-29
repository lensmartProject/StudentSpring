package com.prabhat.app.controler;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prabhat.app.services.topicService;
import com.prabhat.app.topics.topics;

@RestController
public class topicController {
	@Autowired
	private topicService tpservices;
	
	@RequestMapping("/topics")
	public List<topics>  getAllTopic() {
		return tpservices.getAllTopic();
	
	}
	@RequestMapping("/topics/{id}")
	public topics getTopicByID(@PathVariable String id) {
		return tpservices.getTopicByID(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/topics")
	public void addTopic(@RequestBody topics topic) {
		tpservices.addTopic(topic);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/topics/{id}")
	public void UpdateTopic(@RequestBody topics topic , @PathVariable String id) {
		tpservices.UpdateTopic(id ,topic);
		
	}
	

}
