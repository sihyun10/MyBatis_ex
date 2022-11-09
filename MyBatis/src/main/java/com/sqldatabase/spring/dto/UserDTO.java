package com.sqldatabase.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor //자동으로 모든 매개변수를 받는 생성자를 생성
@Getter
@Setter
public class UserDTO {
	private String name;
	private String phone;
	private String addr;
}