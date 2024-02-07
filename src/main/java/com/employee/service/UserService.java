package com.employee.service;

import com.employee.dto.UserRegistrationDto;
import com.employee.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
