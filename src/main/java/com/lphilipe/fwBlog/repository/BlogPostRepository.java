package com.lphilipe.fwBlog.repository;

import com.lphilipe.fwBlog.models.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
    void deleteBlogPostById(Long id);

    Optional<BlogPost> findBlogPostById(Long id);
}

