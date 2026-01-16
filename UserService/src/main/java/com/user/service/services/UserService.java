package com.user.service.services;

import com.user.service.entities.User;

import java.util.List;

public interface UserService {

    // user operations

    //create
    User saveUser(User user);

    //getAll user
    List<User> getAllUser();

    //get single user by userId
    User getUser(String userId);

    //update user


    //delete user by id
    void deleteUser(String userId);

}
