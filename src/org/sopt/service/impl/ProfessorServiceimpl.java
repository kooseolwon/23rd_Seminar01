package org.sopt.service.impl;

import org.sopt.model.Professor;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.service.ProfessorService;

public class ProfessorServiceimpl implements ProfessorService {
    final ProfessorBuilder prof1builder = new ProfessorBuilder();
    final Professor prof1 = prof1builder
            .build();
    @Override
    public Professor getByProfnum(int prof_num) {
        return prof1;
    }
}
