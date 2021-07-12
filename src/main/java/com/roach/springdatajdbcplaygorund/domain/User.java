package com.roach.springdatajdbcplaygorund.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "user")
public class User {

    @Id
    private final Long id;

    private final String name;

    @Embedded.Nullable
    private Address address;

    public User(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static User of (String name, Address address) {
        return new User(null, name, address);
    }

}
