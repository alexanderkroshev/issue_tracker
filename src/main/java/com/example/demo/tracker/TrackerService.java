package com.example.demo.tracker;

import com.example.demo.issue.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackerService {

    private final TrackerRepository trackerRepository;

    @Autowired
    public TrackerService(TrackerRepository repository) {
        this.trackerRepository = repository;
    }

    public List<Tracker> findAll() {
        return trackerRepository.findAll();
    }

    public void save(Tracker tracker) {
        trackerRepository.save(tracker);
    }





}
