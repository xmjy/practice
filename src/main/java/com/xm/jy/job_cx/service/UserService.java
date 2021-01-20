package com.xm.jy.job_cx.service;

import com.xm.jy.job_51.dto.UserDTO;
import com.xm.jy.job_cx.model.User;

import java.util.List;
import java.util.Map;

/**
 * @author: albert.fang
 * @date: 2020/4/24 16:27
 * @description: User的service层接口
 */
public interface UserService {
    User gainUserByNameAndPassword(String userName, String password);

    void addUser(UserDTO userDTO);

    User gainUserByName(String userName);

    List<Map> getUserIdAndName();

    Map getSingleUserIdAndName();
}
