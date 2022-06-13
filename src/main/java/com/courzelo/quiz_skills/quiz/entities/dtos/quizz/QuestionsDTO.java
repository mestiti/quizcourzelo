package com.courzelo.quiz_skills.quiz.entities.dtos.quizz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class QuestionsDTO {
    private String question;
    private float points;
    private float timerperquestion;
    private List<String> correctanswer;
    private List<String> wronganswer;


    public QuestionsDTO()
    {
        super();
    }


}
