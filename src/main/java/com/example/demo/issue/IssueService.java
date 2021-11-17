package com.example.demo.issue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {

    private final IssueRepository repository;

    @Autowired
    public IssueService(IssueRepository repository) {
        this.repository = repository;
    }

    public List<Issue> findAll() {
        return repository.findAll();
    }

    public void save(Issue tracker) {
        repository.save(tracker);
    }


}
