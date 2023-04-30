package com.movies_api.aakash.movies.controller;


import com.movies_api.aakash.movies.model.Movies;
import com.movies_api.aakash.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping("/all")
    public ResponseEntity<List<Movies>>getAllMovies(){

        return new ResponseEntity<>(movieService.getMovies(), HttpStatus.OK);
    }
}
