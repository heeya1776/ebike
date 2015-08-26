package com.jten2015.ebike.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jten2015.ebike.dao.UserDao;
import com.jten2015.ebike.vo.UserVo;

@Service
public class AdminService {
	
	@Autowired
	UserDao userDao;
	
	public UserVo adminLogin(HttpSession session, String id, String password){
		
		Map<String, String> map = new HashMap();
		map.put("userId", id);
		map.put("userPassword", password);
		
		UserVo vo = userDao.getVo(map);
		String str = vo.getUserType();
		if((vo != null) && (str.equals("admin"))){
			session.setAttribute("authUser", vo);
		}
		
		return vo;
		
	}
	
	public List<UserVo> getList(Long page){
		
		List<UserVo> list = userDao.getList(page);
		
		return list;
		
	}
	
	public long getTotal(){
		
		long total = userDao.getTotal();
		
		return total;
	}
	
	public List<UserVo> getListByName(String name){
		
		List<UserVo> list = userDao.getListByName(name);
		
		return list;
		
	}
	
	public List<UserVo> getListById(String id){
		
		List<UserVo> list = userDao.getListById(id);
		
		return list;
	}

}
