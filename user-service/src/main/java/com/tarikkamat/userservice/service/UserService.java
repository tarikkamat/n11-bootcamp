package com.tarikkamat.userservice.service;

import com.tarikkamat.userservice.dao.UserRepository;
import com.tarikkamat.userservice.entity.User;
import com.tarikkamat.userservice.general.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseEntityService<User, UserRepository> {
    protected UserService(UserRepository repository) {
        super(repository);
    }
}
