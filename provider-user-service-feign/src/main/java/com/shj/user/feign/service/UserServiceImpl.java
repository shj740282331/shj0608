package com.shj.user.feign.service;


import com.shj.user.feign.dao.UserDao;
import com.shj.user.feign.pojo.Movie;
import com.shj.user.feign.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    RestTemplate restTemplate;

    /**
     *  根据id获取用户信息
     * @param id
     * @return
     */
    public User getUser(Integer id) {
        User user = userDao.getUser(id);
        return user;
    }

    /**
     * 调用电影服务,进行买票功能
     * @param id
     * @return
     */
    public Map<String,Object> buyMovie(Integer id){
        Map<String,Object> result = new HashMap<>();
        User user = this.getUser(id);
        result.put("user",user);

        ResponseEntity<Movie> responseEntity = restTemplate.getForEntity("http://PROVIDER-MOVIE-SERVICE/movie", Movie.class);
        Movie movie = responseEntity.getBody();
        result.put("movie",movie);
        return result;
    }


}
