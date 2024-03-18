package com.tarikkamat.userservice.controller;

import com.tarikkamat.userservice.controller.contract.UserControllerContract;
import com.tarikkamat.userservice.dto.UserDTO;
import com.tarikkamat.userservice.request.UserSaveRequest;
import com.tarikkamat.userservice.request.UserUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserControllerContract userControllerContract;

    @Autowired
    public UserController(UserControllerContract userControllerContract) {
        this.userControllerContract = userControllerContract;
    }

    @PostMapping
    public UserDTO addUser(@RequestBody UserSaveRequest request) {
        UserDTO userDTO = userControllerContract.addUser(request);
        return userDTO;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        List<UserDTO> userDTOs = userControllerContract.getAllUsers();
        return userDTOs;
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable("id") UUID id) {
        UserDTO userDTO = userControllerContract.getUserById(id);
        return userDTO;
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") UUID id) {
        userControllerContract.deleteUserById(id);
    }

    @PutMapping("/{debugId}")
    public UserDTO updateUserById(@PathVariable("debugId") UUID debugId, @RequestBody UserUpdateRequest request) {
        UserDTO userDTO = userControllerContract.updateUserById(request);
        return userDTO;
    }

    @PutMapping("/{debugId}/location")
    public UserDTO updateUserLocationById(@PathVariable("debugId") UUID id, @RequestBody UserUpdateRequest request) {
        UserDTO userDTO = userControllerContract.updateUserLocationById(request);
        return userDTO;
    }

}
