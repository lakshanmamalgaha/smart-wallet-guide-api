package com.smart.wallet.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.smart.wallet.model.Event;
@Repository
public interface EventRepository extends MongoRepository<Event,String> {
	public List<Event> findByUserIdAndName(String userId, String name);

}
