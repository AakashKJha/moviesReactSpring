package com.movies_api.aakash.movies.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("movies")
public class MovieController {
    @GetMapping("/all")
    public ResponseEntity<String>getAllMovies(){
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }
}
