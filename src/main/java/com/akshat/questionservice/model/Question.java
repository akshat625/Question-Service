package com.akshat.questionservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @GeneratedValue is used to configure the way of increment of the specified column(field).
    // GenerationType.IDENTITY: It is used to specify that the primary key is an auto-increment column.
    //GenerationType.SEQUENCE: It is used to specify that the primary key is generated by a database sequence.
    private Integer id;
    private String category;
    private String difficulty_level;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String right_answer;

}
