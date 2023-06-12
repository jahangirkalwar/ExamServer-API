package com.exam.examserver.service;

import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;

import java.util.Set;

public interface UserService{

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    public User saveUser(User user);

    //get user ny name
    public User getUser(String username);

    public void deleteUser(Long userId);

}
