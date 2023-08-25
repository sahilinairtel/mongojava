package com.sahil.mongojava.controller;

import com.sahil.mongojava.repository.PostRepository;
import com.sahil.mongojava.model.Post;
import com.sahil.mongojava.repository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @RequestMapping(value="/")
    public String home(HttpServletResponse response) throws IOException {
        return "Up and Running";
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }

    @GetMapping("/posts/{query}")
    public List<Post> search(@PathVariable String query){
        return srepo.findByText(query);
    }

    @PostMapping("/posts")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }
}

