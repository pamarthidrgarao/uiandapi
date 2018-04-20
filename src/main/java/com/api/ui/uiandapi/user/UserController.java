package com.api.ui.uiandapi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveOrUpdate")
	@ResponseBody
	public UserResponse save(@RequestBody User user) {
		UserResponse response = new UserResponse();
		response.setUser(userService.save(user));
		response.setSuccess(true);
		return response;
	}

	@GetMapping("/getAll")
	@ResponseBody
	public UserResponse get() {
		UserResponse response = new UserResponse();
		response.setUsers(userService.getAll());
		response.setSuccess(true);
		return response;
	}
	
	@GetMapping("/findByMail")
	@ResponseBody
	public UserResponse getByMail(@RequestParam String email) {
		UserResponse response = new UserResponse();
		response.setUser(userService.findByEmail(email));
		response.setSuccess(true);
		return response;
	}

}
