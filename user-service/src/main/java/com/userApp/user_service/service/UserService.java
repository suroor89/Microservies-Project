package com.userApp.user_service.service;

import com.userApp.user_service.dto.ResponseDto;
import com.userApp.user_service.entity.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}
