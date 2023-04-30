package com.movies_api.aakash.movies.service;

import com.movies_api.aakash.movies.model.Movies;
import com.movies_api.aakash.movies.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepo movieRepo;
    public List<Movies> getMovies(){
        return movieRepo.findAll();
    }

}
