package com.example.demo.controller;

import com.example.demo.classes.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {

        List<Topic> topics = new ArrayList<>();

        //add first topic
        Topic topic1 = new Topic(
                UUID.randomUUID(),
                "Topic1",
                "Bla");
        topics.add(topic1);

        //add second topic
        Topic topic2 = new Topic(
                UUID.randomUUID(),
                "Topic2",
                "this is a description");
        topics.add(topic2);

        return topics;
    }

}
