package com.example.springdataforum.dtos;

import com.example.springdataforum.models.Posts;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;

public class UsersDto {
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    private String username;
    private String password;
    private String status;
    private String email;
    private String avatar_url;
    private String age;
    @JsonIgnore
    Set<Posts> posts = new HashSet<>();

    public Set<Posts> getPosts() {
        return posts;
    }

    public void setPosts(Set<Posts> posts) {
        this.posts = posts;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UsersDto(long id, String username, String email, String password, String status, String avatar_url, String age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.status = status;
        this.avatar_url = avatar_url;
        this.age = age;
        this.email = email;
    }

    public UsersDto() {
    }

    @Override
    public String toString() {
        return "UsersDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", email='" + email + '\'' +
                ", avatar_url='" + avatar_url + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
