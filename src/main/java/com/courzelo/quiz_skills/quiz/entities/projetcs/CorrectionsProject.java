package com.courzelo.quiz_skills.quiz.entities.projetcs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CorrectionsProject {
    private Long idtrainee;
    private List<String> names;
    private List<String> types;
    private List<String> downloadurl;
    public CorrectionsProject()
    {super();}
}
