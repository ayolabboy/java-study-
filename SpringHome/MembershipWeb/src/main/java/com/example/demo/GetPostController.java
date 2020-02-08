package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GetPostController {
	
	 // @RequestMapping(value = "/create", method = RequestMethod.GET)
	 
	 @RequestMapping(value = "/create", method = RequestMethod.POST) public String
	 confirm(HttpServletRequest request, Model model) {
	 model.addAttribute("userid",request.getParameter("userid"));
	 model.addAttribute("name",request.getParameter("name"));
	 model.addAttribute("gender",request.getParameter("gender"));
	 model.addAttribute("city",request.getParameter("city"));
	 
	 return "create"; }
	 
/*
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String confirm(UserVO userVO) {
		return "create";
	}
	*/
}
