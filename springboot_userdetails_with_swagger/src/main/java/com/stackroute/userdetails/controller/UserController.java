package com.stackroute.userdetails.controller;


import com.stackroute.userdetails.domain.User;
import com.stackroute.userdetails.exceptions.UserAlreadyExistException;
import com.stackroute.userdetails.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService1) {
        this.userService = userService1;
    }


    @PostMapping("user")
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        ResponseEntity responseEntity;
        try {
            userService.saveUser(user);
            responseEntity = new ResponseEntity<String>("successfully created", HttpStatus.CREATED);

        } catch (UserAlreadyExistException ex) {
            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;
    }


    @GetMapping("user")
    public ResponseEntity<?> getAllUsers(){
        return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);

    }

    @PutMapping(value="user/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") int id){
        return new ResponseEntity<List<User>>(userService.deleteUser(id),HttpStatus.OK);
    }


}


