package com.cristian.blog.services;

import com.cristian.blog.domain.CreatePostRequest;
import com.cristian.blog.domain.UpdatePostRequest;
import com.cristian.blog.domain.entities.Post;
import com.cristian.blog.domain.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface PostService {
    Post getPost(UUID id);
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
    List<Post> getDraftPosts(User user);
    Post createPost(User user, CreatePostRequest createPostRequest);
    Post updatePost(UUID id, UpdatePostRequest updatePostRequest);
    void deletePost(UUID id);
}
