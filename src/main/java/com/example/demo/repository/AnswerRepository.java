package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class AnswerRepository {
    private final Map<Integer, String> DATABASE = new HashMap<>();

    public List<String> getAll() {
        return DATABASE.values().stream().collect(Collectors.toList());
    }

    public void create(String answer) {
        DATABASE.put(DATABASE.keySet().size(), answer);
    }
}
