package com.stn.postapichallenge.controller;

import com.stn.postapichallenge.model.Posts;
import com.stn.postapichallenge.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("/allPosts")
    private List<Posts> getAllPosts()
    {
        return postService.getAllPosts();
    }

    @GetMapping("/allPosts/{postId}")
    private Posts getPost(@PathVariable("postId") int postId)
    {
        return postService.getPostById(postId);
    }

    @DeleteMapping("/deletePost/{postId}")
    private void deletePost(@PathVariable("postId") int postId)
    {
        postService.delete(postId);
    }

    @PostMapping("/posts")
    private int createPost(@RequestBody Posts posts)
    {
        postService.createOrUpdate(posts);
        return posts.getPostId();
    }

    @PutMapping("/updatePost")
    private Posts updatePost(@RequestBody Posts posts)
    {
        postService.createOrUpdate(posts);
        return posts;
    }
}
