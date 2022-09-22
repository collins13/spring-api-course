package io.rashidjavacourse.apicourse.Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
   private  List<Topic> topics = new ArrayList<>(Arrays.asList(
        new Topic("spring", "spring boot", "spring boot description"),
        new Topic("java", "java code", "java code description"),
        new Topic("javascript", "javascript core", "javascript core description")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }
}
