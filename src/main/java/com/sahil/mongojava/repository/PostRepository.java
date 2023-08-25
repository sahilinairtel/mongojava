package com.sahil.mongojava.repository;

import com.sahil.mongojava.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
