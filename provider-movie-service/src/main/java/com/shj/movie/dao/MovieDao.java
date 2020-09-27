package com.shj.movie.dao;

import com.shj.movie.pojo.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDao {
    @Value("${server.port}")
    String port;

    public Movie getNewMovie() {
        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("战狼,"+port);
        return movie;
    }
}
