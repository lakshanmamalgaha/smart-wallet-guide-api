package com.smart.wallet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smart.wallet.model.Event;
import com.smart.wallet.service.EventService;

@RestController
public class EventController {
	@Autowired
	private EventService eventService;
	
	@PostMapping(
			  value = "/createEvent", consumes = "application/json", produces = "application/json")
	public Event createTransaction(@RequestBody Event event ) {
		return eventService.saveEvent(event);
	}
	@RequestMapping(value="/getEvents",method=RequestMethod.GET)
	public List<Event> getFilterByDate(@RequestParam(value="filter", required=false, defaultValue="")String filter){
		return eventService.getEventByUserId(filter);
	}

}
