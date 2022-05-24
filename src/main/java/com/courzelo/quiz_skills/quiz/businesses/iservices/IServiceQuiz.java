package com.courzelo.quiz_skills.quiz.businesses.iservices;


import com.courzelo.quiz_skills.quiz.entities.dtos.QuizDTO;

public interface IServiceQuiz  {
public QuizDTO getquizbyid(String id);
public float calculatescoreqcu(String id,QuizDTO quizdto);
public float calculatescoreopenquestions(String id,QuizDTO quizdto);
public float calculatescoreqcm(String id,QuizDTO quizdto);
}
