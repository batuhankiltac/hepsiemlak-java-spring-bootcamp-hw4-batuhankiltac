package com.emlakburada.emlakburada.controller;

import com.emlakburada.emlakburada.model.request.UserRequest;
import com.emlakburada.emlakburada.model.response.UserResponse;
import com.emlakburada.emlakburada.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public UserResponse addUser(@RequestBody UserRequest userRequest) {
        return userService.add(userRequest);
    }

    @GetMapping
    public List<UserResponse> getAllUsers() {
        return userService.getAll();
    }

    @PutMapping
    public UserResponse updateUser(@RequestBody UserRequest userRequest) {
        return userService.update(userRequest);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam Integer id) {
        userService.delete(id);
    }
}