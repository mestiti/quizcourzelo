package com.courzelo.quiz_skills.quiz.repositories;

import com.courzelo.quiz_skills.quiz.entities.projetcs.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {
}
