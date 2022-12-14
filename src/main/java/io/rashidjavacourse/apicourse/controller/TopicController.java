package io.rashidjavacourse.apicourse.controller;
import org.springframework.web.bind.annotation.RestController;
import io.rashidjavacourse.apicourse.Models.Topic;
import io.rashidjavacourse.apicourse.Models.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;


@RestController
public class TopicController{

    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
        public List<Topic> getAllTopics(){
            return topicService.getAllTopics();
        }

        @RequestMapping("/topics/{id}")
        public Topic getTopic(@PathVariable String id){
            return topicService.getTopic(id);
        }

        @RequestMapping(method = RequestMethod.POST, value = "/topics")
        public void addTopic(@RequestBody Topic topic){
                topicService.addTopic(topic);
        }
}