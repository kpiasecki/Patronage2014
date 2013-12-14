package zut.wi.kpiasecki.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import zut.wi.kpiasecki.common.model.HelloMessage;

@Controller
@RequestMapping("/api/hello")
public class JSONController {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody
	HelloMessage getHelloMessageInJSON(@RequestParam("person") String name) {

		HelloMessage hello = new HelloMessage();
		hello.setMessage(name);
		
		return hello;

	}

}