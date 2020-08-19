package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RecordService {

    public String getRandomUUID(){
        String id = UUID.randomUUID().toString();

        return id;
    }
}
