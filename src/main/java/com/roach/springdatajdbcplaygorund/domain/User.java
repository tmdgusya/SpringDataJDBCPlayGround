package com.roach.springdatajdbcplaygorund.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.HashMap;
import java.util.Map;

@Table(value = "user")
public class User {

    @Id
    private final Long id;

    private final String name;

    @Embedded.Nullable
    private Address address;

    @MappedCollection(idColumn = "user_id", keyColumn = "id")
    private Map<Long, Post> posts = new HashMap<>();

    public User(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static User of (String name, Address address) {
        return new User(null, name, address);
    }

    public void addPost(Post post) {
        posts.put(0L, post);
    }

}
