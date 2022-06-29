package com.courzelo.quiz_skills.quiz.apirest;

import com.courzelo.quiz_skills.quiz.entities.dtos.projets.ProjectDTO;
import com.courzelo.quiz_skills.quiz.entities.dtos.quizz.QuizDTO;
import com.courzelo.quiz_skills.quiz.servicerest.iservicesrest.IServiceRestProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping( "/api/Project" )
@RestController
public class ProjectApiRest {

    @Autowired
    private IServiceRestProject iproject;



    @PostMapping("/add_project")
    public ResponseEntity<ProjectDTO> addproject(@RequestBody ProjectDTO project) {

        ProjectDTO projectresponse= iproject.addproject(project);
        return new ResponseEntity<>(projectresponse, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete_project/{id}")
    public void delete(@PathVariable("id") String id) {

        iproject.deleteproject(id);

    }


    @PutMapping("/update_project/{id}")
    public ResponseEntity<ProjectDTO> update(@PathVariable("id") String id, @RequestBody ProjectDTO projectdto) {

        ProjectDTO projectreponse=  iproject.updateproject(id,projectdto);
        return new ResponseEntity<>(projectreponse,HttpStatus.CREATED);
    }

    @GetMapping("/get_projectbyid/{id}")
    public ProjectDTO showprojectbyid(@PathVariable("id") String id) {

        return  iproject.getprojectbyid(id);

    }
    @GetMapping("/getall_project")
    public List<ProjectDTO> getallproject() {
        return iproject.getall();

    }
}
