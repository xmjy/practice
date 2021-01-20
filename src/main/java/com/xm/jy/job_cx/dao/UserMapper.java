package com.xm.jy.job_cx.dao;

import com.xm.jy.job_cx.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: albert.fang
 * @date: 2020/4/24 16:17
 * @description: User类dao层接口
 */
public interface UserMapper {

    User getUserByNameAndPassword(@Param(value = "userName") String userName,
                                  @Param(value = "password") String password);

    void userRegister(User user);

    User getUserByName(@Param(value = "userName") String userName);

    List<Map> getUserIdAndName();

    Map getSingleUserIdAndName();
}
