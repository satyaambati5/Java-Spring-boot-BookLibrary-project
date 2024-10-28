package com.example.booklibrary.service;

import com.example.booklibrary.model.CustomUser;
import com.example.booklibrary.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
@Autowired
    UserRepo userRepo;

public List<CustomUser> getUsers(){
    return userRepo.findAll();
}

public void createUser(CustomUser user){
    userRepo.save(user);
}
}
