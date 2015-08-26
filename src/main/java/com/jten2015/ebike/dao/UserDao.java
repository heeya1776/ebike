package com.jten2015.ebike.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.jten2015.ebike.vo.UserVo;

@Repository
public class UserDao {
	
	@Autowired
	SqlMapClientTemplate sqlMapClientTemplate;
	
	public void insertVo(UserVo vo){
		
		sqlMapClientTemplate.insert("user.insertVo", vo);
		
	}
	
	public UserVo getVo(Map map){
		
		UserVo userVo = (UserVo)sqlMapClientTemplate.queryForObject("user.getVo", map);
		
		return userVo;
	}
	
	public List<UserVo> getList(Long page){
		
		List<UserVo> list = sqlMapClientTemplate.queryForList("user.getList", page);
		
		return list;
	}
	
	public long getTotal(){
		
		long total = (long)sqlMapClientTemplate.queryForObject("user.getTotal");
		
		return total;
	}
	
	public List<UserVo> getListByName(String name){
		
		List<UserVo> list = sqlMapClientTemplate.queryForList("user.getListByName", name);
		
		return list;
		
	}

	public List<UserVo> getListById(String id){
		
		List<UserVo> list = sqlMapClientTemplate.queryForList("user.getListById", id);
		
		return list;
		
	}
	
}
