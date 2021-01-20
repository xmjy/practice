package com.xm.jy.job_cx.service.Impl;

import com.xm.jy.job_cx.dao.UserMapper;
import com.xm.jy.job_51.dto.UserDTO;
import com.xm.jy.job_cx.model.User;
import com.xm.jy.job_cx.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: albert.fang
 * @date: 2020/4/24 16:29
 * @description: User的service接口实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User gainUserByNameAndPassword(String userName, String password) {
        return userMapper.getUserByNameAndPassword(userName,password);
    }

    @Override
    public void addUser(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO,user);
        userMapper.userRegister(user);
    }

    @Override
    public User gainUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }

    @Override
    public List<Map> getUserIdAndName() {
        return userMapper.getUserIdAndName();
    }

    @Override
    public Map getSingleUserIdAndName() {
        return userMapper.getSingleUserIdAndName();
    }


}
