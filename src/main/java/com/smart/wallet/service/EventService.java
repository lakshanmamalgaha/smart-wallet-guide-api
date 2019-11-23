package com.smart.wallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.wallet.model.Event;
import com.smart.wallet.repository.EventRepository;

@Service
public class EventService {
	@Autowired
	private EventRepository eventRepository;
	public Event saveEvent(Event event) {
		return eventRepository.save(event);
		
	}
	
	public List<Event> getEventByUserId(String userId,String name){
		return eventRepository.findByUserIdAndName(userId, name);
	}
	
	public List<Event> getAll(){
	return 	eventRepository.findAll();
	}

}
