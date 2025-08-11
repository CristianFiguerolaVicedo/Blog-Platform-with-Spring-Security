package com.cristian.blog.services.impl;

import com.cristian.blog.domain.entities.Tag;
import com.cristian.blog.repositories.TagRepository;
import com.cristian.blog.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    @Override
    public List<Tag> getTags() {
        return tagRepository.findAllWithPostCount();
    }
}
