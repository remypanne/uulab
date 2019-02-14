package com.Cultureguide.uulab.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Cultureguide.uulab.exception.NotFoundException;
import com.Cultureguide.uulab.persistence.entity.CompleteEvent;

@Service
@Transactional
public class CompleteEventService {

	@Autowired
	private CompleteEventRepository completeEventRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public CompleteEventItem findOne(Long id) {
		CompleteEvent c = completeEventRepo.findOne(id);
		if (c != null)
			return new CompleteEventItem(c);
		
		throw new NotFoundException("Evénément non trouvé");
	}
	
	@Override
	public CompleteEventItem createCompleteEvent(CompleteEventItem resource) {
		CompleteEvent completeEvent = mapper.map(resource, CompleteEvent.class);
		completeEvent.setVisible(true);
		return mapper.map(completeEventRepo.save(completeservice), CompleteEventItem.class);
	}
	
	@Override
	public void deleteCompleteEvent(long id) {
		CompleteEvent completeEvent = completeEventRepo.findOne(id);
		completeEvent.setVisible(false);
		CompleteEvent c = completeEvent.save(completeEvent);
		if (c == null) {
			throw new NotFoundException("L'événement n'existe pas");
		}
		
	@Override
	public CompleteEvent findByTag(String tag) {
		return completeEvent.findByTag(tag);
	}
	}
}
