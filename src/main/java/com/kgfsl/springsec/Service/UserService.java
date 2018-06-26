package com.kgfsl.springsec.Service;

import com.kgfsl.springsec.Model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}