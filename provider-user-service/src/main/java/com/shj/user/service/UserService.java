package com.shj.user.service;

import com.shj.user.pojo.User;

import java.util.Map;

public interface UserService {
    User getUser(Integer id);

    Map<String,Object> buyMovie(Integer userId);
}
