package com.cristian.blog.services;

import com.cristian.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
