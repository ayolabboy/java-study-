package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.vo.UserVO;

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
	/*
	 * @RequestMapping(value = "/create/{userid}/{name}/{gender}", method =
	 * RequestMethod.GET) public String confirm(
	 * 
	 * @PathVariable String userid,
	 * 
	 * @PathVariable String name,
	 * 
	 * @PathVariable String gender,
	 * 
	 * @PathVariable String city, Model model) {
	 * 
	 * UserVO uservo = new UserVO(userid,name,gender,city);
	 * model.addAttribute("userVO", uservo); return "create"; }
	 */
	 
}
