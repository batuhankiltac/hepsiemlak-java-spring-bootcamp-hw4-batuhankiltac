package com.emlakburada.emlakburada.service.user;

import com.emlakburada.emlakburada.converter.UserConverter;
import com.emlakburada.emlakburada.domain.User;
import com.emlakburada.emlakburada.model.request.UserRequest;
import com.emlakburada.emlakburada.model.response.UserResponse;
import com.emlakburada.emlakburada.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserConverter userConverter;

    @Override
    public List<UserResponse> getAll() {
        return userRepository.findAll().stream()
                .map(userConverter::convert)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponse add(UserRequest userRequest) {
        User user = userConverter.convert(userRequest);
        return userConverter.convert(userRepository.save(user));
    }

    @Override
    public UserResponse update(UserRequest userRequest) {
        User user = userConverter.convert(userRequest);
        return userConverter.convert(userRepository.save(user));
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}