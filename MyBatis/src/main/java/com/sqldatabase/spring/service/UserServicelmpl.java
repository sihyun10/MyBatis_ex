package com.sqldatabase.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqldatabase.spring.dto.UserDTO;
import com.sqldatabase.spring.mapper.UserMapper;

@Service
public class UserServicelmpl implements UserService {

	@Autowired
	private UserMapper usermapper;
	
	@Override
	public List<UserDTO> selectUsers() throws Exception {
		return usermapper.selectUsers();
	}
	
}