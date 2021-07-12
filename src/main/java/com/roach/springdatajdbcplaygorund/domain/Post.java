package com.roach.springdatajdbcplaygorund.domain;

import org.springframework.data.annotation.Id;

public class Post {

    @Id
    private final Long id;

    private final String title;

    public Post(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public static Post of(String title) {
        return new Post(null, title);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}
