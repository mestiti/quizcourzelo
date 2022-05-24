package com.courzelo.quiz_skills.quiz.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.courzelo.quiz_skills.quiz.entities.Quiz;



@Repository
public interface QuizRepository extends MongoRepository<Quiz, String>{

}
