package com.courzelo.quiz_skills.quiz.entities.quizz;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Corrections {

    Long idtrainee;
    Float score;
    public Corrections()
    {super();}
}
