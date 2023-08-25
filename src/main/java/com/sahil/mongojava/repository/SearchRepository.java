package com.sahil.mongojava.repository;

import com.sahil.mongojava.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
