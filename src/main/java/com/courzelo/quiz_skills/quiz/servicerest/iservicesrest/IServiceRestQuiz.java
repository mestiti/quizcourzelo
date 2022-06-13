package com.courzelo.quiz_skills.quiz.servicerest.iservicesrest;

import com.courzelo.quiz_skills.quiz.entities.dtos.quizz.QuizDTO;

import java.util.List;

public interface IServiceRestQuiz {
    public QuizDTO addquiz(QuizDTO quiz);
    public QuizDTO updatequiz(String id, QuizDTO quizdto);
    public List<QuizDTO> getallquiz();
    public void delete(String id);
}
