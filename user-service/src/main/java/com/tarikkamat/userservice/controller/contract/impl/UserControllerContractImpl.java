package com.tarikkamat.userservice.controller.contract.impl;

import com.tarikkamat.userservice.controller.contract.UserControllerContract;
import com.tarikkamat.userservice.dto.UserDTO;
import com.tarikkamat.userservice.entity.User;
import com.tarikkamat.userservice.mapper.UserMapper;
import com.tarikkamat.userservice.request.UserSaveRequest;
import com.tarikkamat.userservice.request.UserUpdateRequest;
import com.tarikkamat.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserControllerContractImpl implements UserControllerContract {

    private final UserService userService;

    @Override
    public UserDTO addUser(UserSaveRequest request) {
        User user = UserMapper.INSTANCE.convertToSaveUser(request);
        user = userService.save(user);
        return UserMapper.INSTANCE.convertToUserDTO(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = userService.findAll();
        return UserMapper.INSTANCE.convertToUserDTOList(users);
    }

    @Override
    public UserDTO getUserById(UUID id) {
        User user = userService.findById(id);
        return UserMapper.INSTANCE.convertToUserDTO(user);
    }

    @Override
    public void deleteUserById(UUID id) {
        userService.deleteById(id);
    }

    @Override
    public UserDTO updateUserById(UserUpdateRequest request) {
        User user = UserMapper.INSTANCE.convertToUpdateUser(request);
        user = userService.save(user);
        return UserMapper.INSTANCE.convertToUserDTO(user);
    }

    @Override
    public UserDTO updateUserLocationById(UserUpdateRequest request) {
        User user = userService.findById(request.id());
        user.setName(user.getName());
        user.setUsername(user.getUsername());
        user.setLatitude(request.latitude());
        user.setLongitude(request.longitude());
        user = userService.save(user);
        return UserMapper.INSTANCE.convertToUserDTO(user);
    }
}
