package com.example.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;

@RestController // define que está classe é um controller
@RequestMapping(value = "/users") // define meu endpoint
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Jordan", "jordan@gamil.com", "41995284874", "123456789");
		return ResponseEntity.ok().body(u);
	}

}
