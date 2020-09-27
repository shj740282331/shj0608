package com.shj.user.feign.service.feign;

import com.shj.user.feign.pojo.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVIDER-MOVIE-SERVICE")
public interface MovieServiceFeign {
    @GetMapping("movie")
    Movie ashjdka();
}
