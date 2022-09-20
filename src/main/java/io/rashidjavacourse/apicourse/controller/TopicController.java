package io.rashidjavacourse.apicourse.controller;
import org.springframework.web.bind.annotation.RestController;
import io.rashidjavacourse.apicourse.Models.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;


@RestController
public class TopicController{

    @RequestMapping("/topics")
        public List<Topic> getAllTopics(){
            return Arrays.asList(
                new Topic("spring", "spring boot", "spring boot description"),
                new Topic("java", "java code", "java code description"),
                new Topic("javascript", "javascript core", "javascript core description")
            );
        }
}