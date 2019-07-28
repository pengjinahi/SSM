package com.pjh.service.impl;

import com.pjh.dao.UserDao;
import com.pjh.entity.Emp;
import com.pjh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public ArrayList<Emp> getuser() {
        return userDao.getuser();
    }
}
