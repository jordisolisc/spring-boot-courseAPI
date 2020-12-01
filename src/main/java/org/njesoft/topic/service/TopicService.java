package org.njesoft.topic.service;

import org.njesoft.topic.model.Topic;
import org.njesoft.topic.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(1, "Spring Framework", "Spring Framework Description"),
            new Topic(2, "Core Java", "Core Java Description"),
            new Topic(3, "Javascript Framework", "Javascript Framework Description")
    ));

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopicById(Integer id) {
        return topicRepository.findById(id).get();
        //return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
//        topics.add(topic);
    }

    public void updateTopic(Integer id, Topic topic) {
        topicRepository.save(topic);
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//
//            }
//        }

    }

    public void deleteTopic(Integer id) {
        topicRepository.deleteById(id);
//        topics.removeIf(topic -> topic.getId().equals(id));
    }
}
