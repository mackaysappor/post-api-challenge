package com.stn.postapichallenge.repository;

import com.stn.postapichallenge.model.Posts;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Posts, Integer> {
}
