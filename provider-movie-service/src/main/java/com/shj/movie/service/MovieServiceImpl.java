package com.shj.movie.service;

import com.shj.movie.dao.MovieDao;
import com.shj.movie.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieDao movieDao;
    @Override
    public Movie getNewMovie() {
        return movieDao.getNewMovie();
    }
}
