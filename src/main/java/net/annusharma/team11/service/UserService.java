package net.annusharma.team11.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.annusharma.team11.dto.UserRegistrationDto;
import net.annusharma.team11.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
