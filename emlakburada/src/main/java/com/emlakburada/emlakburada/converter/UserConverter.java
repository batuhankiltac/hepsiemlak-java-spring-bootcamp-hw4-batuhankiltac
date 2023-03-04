package com.emlakburada.emlakburada.converter;

import com.emlakburada.emlakburada.domain.User;
import com.emlakburada.emlakburada.model.request.UserRequest;
import com.emlakburada.emlakburada.model.response.UserResponse;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserResponse convert(User user) {
        return UserResponse.builder()
                .userType(user.getUserType())
                .name(user.getName())
                .email(user.getEmail())
                .bio(user.getBio())
                .build();
    }

    public User convert(UserRequest userRequest) {
        return User.builder()
                .userType(userRequest.getUserType())
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .bio(userRequest.getBio())
                .build();
    }
}