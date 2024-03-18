package com.tarikkamat.userservice.mapper;

import com.tarikkamat.userservice.dto.UserDTO;
import com.tarikkamat.userservice.entity.User;
import com.tarikkamat.userservice.request.UserSaveRequest;
import com.tarikkamat.userservice.request.UserUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDTO convertToUserDTO(User user);
    User convertToSaveUser(UserSaveRequest request);
    List<UserDTO> convertToUserDTOList(List<User> users);
    User convertToUpdateUser(UserUpdateRequest request);
}
