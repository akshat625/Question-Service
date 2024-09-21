package com.akshat.questionservice.controller;


import com.akshat.questionservice.model.Question;
import com.akshat.questionservice.model.QuestionWrapper;
import com.akshat.questionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")

public class  QuestionController {
    @Autowired
    QuestionService questionSerivce;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionSerivce.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return questionSerivce.getQuestionsByCategory(category);
    }

    @PostMapping("addQuestion")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionSerivce.addQuestion(question);
    }

    @DeleteMapping("deleteQuestion/{id}")
    public ResponseEntity<String> deleteQuestion(@PathVariable Integer id){
        return questionSerivce.deleteQuestion(id);
    }

    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String category, @RequestParam int numQ){
        return questionSerivce.getQuestionsForQuiz(category,numQ);
    }

    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromIds(@RequestBody List<Integer> questionIds){
        return questionSerivce.getQuestionsFromIds(questionIds);
    }

}
