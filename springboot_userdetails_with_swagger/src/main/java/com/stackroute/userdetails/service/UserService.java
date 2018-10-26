package com.stackroute.userdetails.service;

import com.stackroute.userdetails.domain.User;
import com.stackroute.userdetails.exceptions.UserAlreadyExistException;

import java.util.List;

public interface UserService {


    public User saveUser(User user) throws UserAlreadyExistException;
    public List<User> getAllUsers();

    public List<User> deleteUser(int id);

}
