package org.sopt.service;

import org.sopt.model.Professor;

public interface ProfessorService {
    Professor getByProfnum(final int prof_num);
}
