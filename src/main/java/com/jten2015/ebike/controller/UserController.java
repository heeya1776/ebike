package com.jten2015.ebike.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jten2015.ebike.service.UserService;
import com.jten2015.ebike.vo.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/loginform")
	public String loginForm(){
		
		return "/user/login";
		
	}
	
	@RequestMapping("/login")
	public String login(HttpSession session, @RequestParam("userId") String userId, @RequestParam("userPassword") String userPassword){
		
		System.out.println(userId + "+" +userPassword);
		UserVo userVo = userService.login(session, userId, userPassword);
		
		if(userVo == null){
			return "redirect:/user/loginform";
		}
		
		return "redirect:/";
		
	}
	
	@RequestMapping("/joinform")
	public String joinForm(){
		
		return "/user/join";
		
	}
	
	@RequestMapping("/join")
	public String join(@ModelAttribute UserVo vo){
		
		System.out.println(vo);
		
		userService.insert(vo);
		
		return "redirect:/user/joinsuccess";
		
	}
	
	@RequestMapping("/joinsuccess")
	public String joinsuccess(){
		
		return "/user/joinsuccess";
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		
		if(session == null){
			return "redirect:/";
		}
		
		userService.logout(session);
		
		return "redirect:/";
	}
	
}
