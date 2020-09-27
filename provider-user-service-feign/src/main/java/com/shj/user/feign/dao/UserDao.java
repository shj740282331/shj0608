package com.shj.user.feign.dao;


import com.shj.user.feign.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public User getUser(Integer id){
        User user = new User();
        user.setId(1);
        user.setUserName("zhaungsan");
        return user;
    }
}
