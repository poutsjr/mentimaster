package com.example.demo.service;

import com.example.demo.entity.Answer;
import com.example.demo.repository.AnswerRepositoryItf;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AnswerService {

    public AnswerService(AnswerRepositoryItf answerRepository) {
        this.answerRepository = answerRepository;
    }

    AnswerRepositoryItf answerRepository;

    public List<Answer> getAll() {
        return answerRepository.findAll();
    }

    public void create(String answer) {
        //answerRepository.create(answer);
    }
}
