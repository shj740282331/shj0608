package com.shj.user.feign.service;



import com.shj.user.feign.pojo.User;

import java.util.Map;

public interface UserService {
    User getUser(Integer id);

    Map<String,Object> buyMovie(Integer userId);
}
