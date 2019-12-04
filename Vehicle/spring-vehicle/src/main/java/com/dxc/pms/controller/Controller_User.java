package com.dxc.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.pms.model.User;

import com.dxc.pms.service.UserService;
@RestController
@RequestMapping("user")
@CrossOrigin(origins= {"http://localhost:3000","https://localhost:4200"})
public class Controller_User {
	@Autowired
	UserService service;
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable("userId")int uId) {
	System.out.println("My path variable test 2. The user Id entered is "+uId);
	User user=new User();
	System.out.println("Inside Before");
	if(service.isUserExists(uId)) {
		
		user=service.getUser(uId);
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
	else {
		return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
	}
		
	}

	@DeleteMapping("/{userId}")
	public ResponseEntity<User> deleteUser(@PathVariable("userId")int uId) {
	System.out.println("Deleting user is working");
	
	if(service.isUserExists(uId)) {
		service.deleteUser(uId);
		
		return new ResponseEntity<User>(HttpStatus.OK);
		
	}
	else {
		return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	}
		
	}
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers() {
	System.out.println("Getting all Users is working");
	List<User>list=service.getAllUsers();
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}
	@PostMapping()
	public ResponseEntity<User> saveUser(@RequestBody User user) {
	System.out.println("Saving a user is working");
	System.out.println(user);
	if(service.isUserExists(user.getUserId())) {
	   
		return new ResponseEntity<User>(user,HttpStatus.CONFLICT);
	}
	else {
		service.addUser(user);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
		
	}
		
	}
	@PutMapping
	public ResponseEntity<User> updateUser(@RequestBody User user) {
	System.out.println("Updating  user is working");
	System.out.println(user);
	if(service.isUserExists(user.getUserId())) {
		service.updateUser(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
		
	}
	else {
		return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
	}
		
}
	
	@GetMapping("/login/{email}")
	public ResponseEntity login(@PathVariable("email")String email) {
	System.out.println("Get UserId by email is working");
	if(service.isEmailExists(email)) {
		int userId=service.login(email);
		return new ResponseEntity (userId, HttpStatus.OK);
	}
	else {
		return new ResponseEntity (HttpStatus.NOT_FOUND);
	}
	
	

}
}
