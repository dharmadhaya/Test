package com.trainings.library.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainings.library.service.UserService;
import com.trainings.library.web.model.User;
import com.trainings.library.web.model.UserAccount;

@RestController
@RequestMapping("/user")
public class HomeController {
	@Autowired
	UserService userService;

	@PostMapping("/createAccount")
	public String createAccount(@RequestBody UserAccount userAccount) {
		userService.addUserAccountDetails(userAccount);
		return "You've successfully registered!";

	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody User user) {

		boolean result = userService.validate(user);
		if (result) {
			return new ResponseEntity<>("Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("fail", HttpStatus.FORBIDDEN);
		}
	}

}
