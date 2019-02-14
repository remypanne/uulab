package com.Cultureguide.uulab.service;

import com.Cultureguide.uulab.dto.CompleteEventItem;
import com.Cultureguide.uulab.persistence.entity.CompleteEvent;

public interface ICompleteEventService {

	CompleteEventItem findOne(Long id);
	
	CompleteEventItem createCompleteEvent(CompleteEvent resource);
	
	void deleteCompleteEvent(long id);
	
	CompleteEvent findByTag(String tag);
	
}
