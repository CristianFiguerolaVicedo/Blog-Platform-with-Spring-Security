package com.cristian.blog.services;

import com.cristian.blog.domain.entities.Post;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface PostService {
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
}
