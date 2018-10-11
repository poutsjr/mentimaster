package com.example.demo.repository;

import com.example.demo.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepositoryItf extends JpaRepository<Answer, Long> {

    Answer findFirstByValue(String value);
}
