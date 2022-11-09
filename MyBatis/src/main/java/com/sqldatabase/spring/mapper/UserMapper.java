package com.sqldatabase.spring.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sqldatabase.spring.dto.UserDTO;

@Mapper
public interface UserMapper {
	List<UserDTO> selectUsers() throws Exception;
}