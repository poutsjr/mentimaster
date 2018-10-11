package com.example.demo.resource;

import com.example.demo.service.AnswerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController("/answers")
public class AnswerResource {

    public AnswerResource(AnswerService answerService) {
        this.answerService = answerService;
    }

    private AnswerService answerService;

    @RequestMapping
    public List<String> getAll() {
//        return answerService.getAll();
        return null;
    }

    @RequestMapping(method = POST)
    public void create(@RequestParam String answer) {
        answerService.create(answer);
    }
}
