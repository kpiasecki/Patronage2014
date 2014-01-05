package zut.wi.kpiasecki.common.controller;

import java.util.Collection;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import zut.wi.kpiasecki.common.model.MessageService;
import zut.wi.kpiasecki.common.model.User;
import zut.wi.kpiasecki.common.model.UserService;

@Controller
@RequestMapping("/api/users")
public class UserController {
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public  @ResponseBody
	User getUserInJSON(@PathVariable("id") Integer id) {

		//HelloMessage hello = new HelloMessage();
		//hello.setMessage("GET method with parameter: " + name);
		
		UserService us = new UserService();
		User user = us.getUser(id);
		
		return user;

	}
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public  @ResponseBody
	Collection<User>/*HashMap<Integer, User>*/  getAllUsersInJSON() {

		//HelloMessage hello = new HelloMessage();
		//hello.setMessage("GET method without parameter!");
		UserService us = new UserService();
		return us.getAllUsers().values();

	}
	
	@RequestMapping(value="", method = RequestMethod.POST,
			headers="Content-Type=application/json")
	public  @ResponseBody
	MessageService createHelloMessageInJSON(@RequestBody User user) {

		//HelloMessage hello = new HelloMessage();
		//hello.setMessage("POST method with parameter: " + hello.getMessage());
		
		UserService us = new UserService();
		MessageService message = us.addUser(user);
		return message;

	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.PUT,
			headers="Content-Type=application/json")
	public  @ResponseBody
	MessageService updateHelloMessageInJSON(@PathVariable("id") Integer id,
			@RequestBody User user) {

		//String name = hello.getMessage();
		//hello.setMessage("PUT method! with parameters: " + id + " " + name);
		
		UserService us = new UserService();
		MessageService message = us.updateUser(id, user);

		return message;

	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public  @ResponseBody
	MessageService deleteHelloMessageInJSON(@PathVariable("id") Integer id) {

		//HelloMessage hello = new HelloMessage();
		//hello.setMessage("DELETE method with parameter " + id);
		
		
		UserService us = new UserService();
		MessageService message = us.deleteUser(id);
		
		return message;

	}
}
