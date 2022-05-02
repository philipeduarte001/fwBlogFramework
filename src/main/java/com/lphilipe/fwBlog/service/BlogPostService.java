package com.lphilipe.fwBlog.service;

import com.lphilipe.fwBlog.exception.NotFoundException;
import com.lphilipe.fwBlog.models.BlogPost;
import com.lphilipe.fwBlog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BlogPostService {
    private final BlogPostRepository blogPostRepo;

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepo) {

        this.blogPostRepo = blogPostRepo;
    }

    public BlogPost addBlogPost(BlogPost blogPost) {

        return blogPostRepo.save(blogPost);
    }

    public List<BlogPost> findAllBlogPosts() {

        return blogPostRepo.findAll();
    }

    public BlogPost updateBlogPost(BlogPost blogPost) {

        return blogPostRepo.save(blogPost);
    }

    public BlogPost findBlogPostById(Long id) {
        return (BlogPost) blogPostRepo.findBlogPostById(id)
                .orElseThrow(() -> new NotFoundException("Post with id " + id + " was not found"));
    }

    public void deleteBlogPost(Long id){
        blogPostRepo.deleteBlogPostById(id);
    }
}



