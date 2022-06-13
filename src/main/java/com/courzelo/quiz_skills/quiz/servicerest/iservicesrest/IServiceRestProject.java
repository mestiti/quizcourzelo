package com.courzelo.quiz_skills.quiz.servicerest.iservicesrest;



import com.courzelo.quiz_skills.quiz.entities.dtos.projets.ProjectDTO;

import java.util.List;


public interface IServiceRestProject {

    public ProjectDTO addproject(ProjectDTO projectdto);
    public ProjectDTO updateproject(String id, ProjectDTO projectdto);
    public ProjectDTO getprojectbyid(String id);
    public void deleteproject(String id);
    public List<ProjectDTO> getall();
}
