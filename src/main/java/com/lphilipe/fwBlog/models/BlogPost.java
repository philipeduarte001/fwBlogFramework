package com.lphilipe.fwBlog.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
public class BlogPost implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title;
    private String text;
    private String comment;
    private String imageUrl;

    public BlogPost(Long id, String title, String text, String comment, String imageUrl) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.comment = comment;
        this.imageUrl = imageUrl;
    }

    public BlogPost() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BlogPost)) {
            return false;
        }
        BlogPost blogPost = (BlogPost) o;
        return Objects.equals(id, blogPost.id) && Objects.equals(title, blogPost.title) && Objects.equals(text, blogPost.text) && Objects.equals(comment, blogPost.comment) && Objects.equals(imageUrl, blogPost.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, text, comment, imageUrl);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", title='" + getTitle() + "'" +
                ", text='" + getText() + "'" +
                ", comment='" + getComment() + "'" +
                ", imageUrl='" + getImageUrl() + "'" +
                "}";
    }
}
