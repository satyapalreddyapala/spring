package com.stackroute.userdetails.service;

import com.stackroute.userdetails.domain.User;
import com.stackroute.userdetails.exceptions.UserAlreadyExistException;
import com.stackroute.userdetails.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {



    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository1){
        this.userRepository=userRepository1;
    }

    @Override
    public User saveUser(User user) throws UserAlreadyExistException {

        if(userRepository.existsById(user.getId())){
            throw new UserAlreadyExistException("user already exists");
        }
        User savedUser = userRepository.save(user);
        if(savedUser==null){
            throw new UserAlreadyExistException("user already exists");
        }
        return savedUser;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> deleteUser(int id){
        userRepository.deleteById(id);
        return userRepository.findAll();
    }
}
