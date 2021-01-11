package com.example.demo.classes;

import java.util.UUID;

public class Topic {

    private UUID id;
    private String name;
    private String description;



    public Topic(UUID id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
