package com.ozair.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ozair.dto.UserRegistrationDto;
import com.ozair.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
