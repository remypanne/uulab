package com.Cultureguide.uulab.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.Cultureguide.uulab.exception.NotFoundException;
import com.Cultureguide.uulab.dto.UserItem;
import com.Cultureguide.uulab.persistence.entity.User;
import com.Cultureguide.uulab.persistence.repository.UserRepository;
import com.Cultureguide.uulab.service.IUserService;


@Service
@Transactional
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepo;
		
	@Autowired
	private ModelMapper mapper;

	@Override
	public UserItem findOne(Long id) {
		User u = userRepo.findOne(id);
		if (u != null)
			return new UserItem(u);

		throw new NotFoundException("Vous n'existez pas");
		
		}

		
	@Override
	public UserItem createUser(UserItem  resource) {
		User user = mapper.map(resource, User.class);
			user.setVisible(true);
			return mapper.map(userRepo.save(user), UserItem.class);
		}

		@Override
		public void deleteUser(long id) {
			User user = userRepo.findOne(id);
			user.setVisible(false);
			User u = userRepo.save(user);
			if (u == null) {
				throw new NotFoundException("L'utilisateur que vous souhaitez supprimer n'existe pas");
			}
		}
		
		@Override
		public User findByMailAndPassword(String userName, String password) {
			return userRepo.findByMailAndPassword(userName, password);
		}
				
	}


