package com.demo.demoweblogic.controller;

import com.demo.demoweblogic.controller.model.CgiResponse;
import com.demo.demoweblogic.controller.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class ResourceController {
	
	@GetMapping("getUserTpid")
	@ResponseBody
	CgiResponse getUserTpid(@RequestHeader("tpid") String tpid, HttpServletResponse response) {
		User user = new User(tpid);
		CgiResponse result = new CgiResponse();
		result.setUser(user);
		result.setResponseStatus(response.getStatus());
		return result;
	}
}
