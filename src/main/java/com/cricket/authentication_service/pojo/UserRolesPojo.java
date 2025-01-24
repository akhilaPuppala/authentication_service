package com.cricket.authentication_service.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRolesPojo {
	
	private String name;
	private String password;
    private List<Integer> allRolesId;

}

