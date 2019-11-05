package com.watch.service;

import com.watch.domain.models.service.UserServiceModel;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Set;

public interface UserService extends UserDetailsService {
    boolean createUser(UserServiceModel userServiceModel);

    Set<UserServiceModel> getAll();

    boolean promoteUser(String id);

    boolean demoteUser(String id);
}
