package com.ps.services;

import com.ps.base.UserType;
import com.ps.ents.User;
import com.ps.exceptions.MailSendingException;

import java.util.List;

public interface UserService {

    User findById(Long id);

    long countUsers();

    void create(String email, String password, UserType userType);

    List<User> findAll();

}
