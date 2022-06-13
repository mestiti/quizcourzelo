package com.courzelo.quiz_skills.quiz.entities.dtos.projets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CorrectionsProjectDTO {
    private Long idtrainee;
    private List<String> names;
    private List<String> types;
    private List<String> downloadurl;
    public CorrectionsProjectDTO()
    {super();}
}
