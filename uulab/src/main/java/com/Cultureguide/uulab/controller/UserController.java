package com.Cultureguide.uulab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Cultureguide.uulab.dto.UserItem;
import com.Cultureguide.uulab.service.IUserService;
import com.Cultureguide.uulab.utils.AuthChecker;


@RestController
@RequestMapping(value = "/api/auth/user")
public class UserController {

	@Autowired
	private AuthChecker authChecker;

	@Autowired
	private IUserService userService;
	
//	@GetMapping
//	@ResponseBody
//	public List<CommercialListItem> findAll() {
//		return commercialService.findAll();
//	}
//	

	@GetMapping(value = "/{id}")
	@ResponseBody
	public UserItem findOne(@PathVariable Long id) {
		return userService.findOne(id);
	}
	
	@PostMapping
	@ResponseBody
	public UserItem createUser(@RequestBody UserItem  user) {
		return userService.createUser(user);
	}
	
	@DeleteMapping(value = "/{id}")
	@ResponseBody
	public void deleteUser (@PathVariable Long id) {
		userService.deleteUser(id);
	}
	
}

