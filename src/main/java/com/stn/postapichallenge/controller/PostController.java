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

    // GET mapping to retrieve all posts from the db
    @GetMapping("/allPosts")
    private List<Posts> getAllPosts()
    {
        return postService.getAllPosts();
    }

    // GET mapping to retrieve a specific posts from the db using the post id
    @GetMapping("/allPosts/{postId}")
    private Posts getPost(@PathVariable("postId") int postId)
    {
        return postService.getPostById(postId);
    }

    // DELETE mapping to delete a post from the db
    @DeleteMapping("/deletePost/{postId}")
    private void deletePost(@PathVariable("postId") int postId)
    {
        postService.delete(postId);
    }

    // POST mapping to create a new posts in the db
    @PostMapping("/posts")
    private int createPost(@RequestBody Posts posts)
    {
        postService.createOrUpdate(posts);
        return posts.getPostId();
    }

    // PUT mapping to update a posts in the db
    @PutMapping("/updatePost")
    private Posts updatePost(@RequestBody Posts posts)
    {
        postService.createOrUpdate(posts);
        return posts;
    }
}
