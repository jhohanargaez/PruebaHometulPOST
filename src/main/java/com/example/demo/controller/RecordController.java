package com.example.demo.controller;

import com.example.demo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/recordController")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @PostMapping(path = "/createRecord")
    public String findRecord(){
        return recordService.getRandomUUID();
    }
}
