package com.example.ojdbctomcatdemo;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List findByName() {
        return userDao.findByName();
    }

    @Override
    public String addUser(UserModel userModel) {
        return userDao.addUser(userModel);
    }

    @Override
    public String updateUser(UserModel userModel) {
        return userDao.updateUser(userModel);
    }
}