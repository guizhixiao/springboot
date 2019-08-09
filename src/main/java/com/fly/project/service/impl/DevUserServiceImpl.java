package com.fly.project.service.impl;

import com.fly.project.dao.UserDao;
import com.fly.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@Profile("dev")
public class DevUserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<Map<String, String>> getUserList() {
        System.out.println("dev");
        return userDao.getUserList();
    }
}
