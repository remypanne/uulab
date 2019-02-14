package com.Cultureguide.uulab.service;
import com.Cultureguide.uulab.dto.UserItem;
import com.Cultureguide.uulab.persistence.entity.User;

public interface IUserService {
		
		UserItem findOne(Long id);

		UserItem createUser(UserItem resource);
		
		void deleteUser(long id);
		
		User findByMailAndPassword(String userName, String password);

	}


