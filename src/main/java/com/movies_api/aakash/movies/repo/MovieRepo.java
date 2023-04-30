package com.movies_api.aakash.movies.repo;

import com.movies_api.aakash.movies.model.Movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepo extends MongoRepository<Movies, ObjectId> {

}
