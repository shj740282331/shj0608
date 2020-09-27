package com.shj.movie.controller;

import com.shj.movie.pojo.Movie;
import com.shj.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/movie")
    public Movie getNewMovie(){
        return movieService.getNewMovie();
    }
}
