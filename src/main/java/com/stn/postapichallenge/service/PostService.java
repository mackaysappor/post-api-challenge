package com.stn.postapichallenge.service;

import com.stn.postapichallenge.model.Posts;
import com.stn.postapichallenge.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    // get all records of posts using the findAll() method from CrudRepository
    public List<Posts> getAllPosts()
    {
        List<Posts> postsList = new ArrayList<>();
        postRepository.findAll().forEach(posts -> postsList.add(posts));
        return postsList;
    }

    // get a specific post using the findById() method from CrudRepository
    public Posts getPostById(int postId) {
        return postRepository.findById(postId).get();
    }

    // delete a specific post using the deleteById() method from CrudRepository
    public void delete(int postId) {
        postRepository.deleteById(postId);
    }

    // create or update a post using the save() method from CrudRepository
    public void createOrUpdate(Posts posts) {
        postRepository.save(posts);
    }

    public void updatePost(Posts posts, int postId)
    {
        postRepository.save(posts);
    }

}
