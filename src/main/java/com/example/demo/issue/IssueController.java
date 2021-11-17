package com.example.demo.issue;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IssueController {

    private final IssueService service;

    @Autowired
    public IssueController(IssueService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public void save(@ModelAttribute Issue tracker) {
        service.save(tracker);
    }

    @GetMapping("/find_all")
    public List<Issue> findAll() {
        return service.findAll();
    }

}
