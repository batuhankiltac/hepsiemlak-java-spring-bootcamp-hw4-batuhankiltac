package com.emlakburada.emlakburada.service.user;

import com.emlakburada.emlakburada.model.request.UserRequest;
import com.emlakburada.emlakburada.model.response.UserResponse;

import java.util.List;

public interface UserService {
    List<UserResponse> getAll();
    UserResponse add(UserRequest userRequest);
    UserResponse update(UserRequest userRequest);
    void delete(Integer id);
}