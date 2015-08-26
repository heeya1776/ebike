package com.jten2015.ebike.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jten2015.ebike.dao.UserDao;
import com.jten2015.ebike.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public void insert(UserVo vo){
		
		String birth = vo.getBirthYear()+vo.getBirthMonth()+vo.getBirthDay();
		String phone = vo.getPhone1()+vo.getPhone2()+vo.getPhone3();
		String cellPhone = vo.getCellPhone1()+vo.getCellPhone2()+vo.getCellPhone3();
		String zipCode = vo.getZipCode1()+vo.getZipCode2();
		
		System.out.println(birth);
		vo.setBirth(birth);
		vo.setCellPhone(cellPhone);
		vo.setPhone(phone);
		vo.setZipCode(zipCode);
		vo.setUserType("client");
		vo.setUserStatus("using");
		System.out.println(vo);
		userDao.insertVo(vo);
		
	}
	
	public UserVo login(HttpSession session, String userId, String userPassword){
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("userId", userId);
		map.put("userPassword", userPassword);
		
		UserVo userVo = userDao.getVo(map);
		
		System.out.println(userVo);
		if(userVo != null){
			session.setAttribute("authUser", userVo);
		}
		
		return userVo;
	}
	
	public void logout(HttpSession session){
		
		session.removeAttribute("authUser");
		session.invalidate();
		
	}
	
}
