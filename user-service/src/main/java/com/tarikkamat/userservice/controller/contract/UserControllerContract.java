package com.tarikkamat.userservice.controller.contract;

import com.tarikkamat.userservice.dto.UserDTO;
import com.tarikkamat.userservice.request.UserSaveRequest;
import com.tarikkamat.userservice.request.UserUpdateRequest;

import java.util.List;
import java.util.UUID;

public interface UserControllerContract {

    UserDTO addUser(UserSaveRequest request);
    List<UserDTO> getAllUsers();
    UserDTO getUserById(UUID id);
    void deleteUserById(UUID id);
    UserDTO updateUserById(UserUpdateRequest request);
    UserDTO updateUserLocationById(UserUpdateRequest request);

}
