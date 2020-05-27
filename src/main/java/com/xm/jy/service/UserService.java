package com.xm.jy.service;

import com.xm.jy.job_51.dto.UserDTO;
import com.xm.jy.model.User;

/**
 * @author: albert.fang
 * @date: 2020/4/24 16:27
 * @description: User的service层接口
 */
public interface UserService {
    User gainUserByNameAndPassword(String userName, String password);

    void addUser(UserDTO userDTO);

    User gainUserByName(String userName);
}
