package com.sqldatabase.spring.service;

import java.util.List;

import com.sqldatabase.spring.dto.UserDTO;

public interface UserService {
	List<UserDTO> selectUsers() throws Exception;
}