package ebus.service;

import ebus.mapping.UserMapper;
import ebus.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tao.tang on 14-7-29.
 */
@Service
public class MysqlUserService implements UserServiceI{

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insert(user); } }