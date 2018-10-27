package org.sopt.service.impl;

import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.service.StudentService;

public class StudentServiceimpl implements StudentService {
    final StudentBuilder student1Builder = new StudentBuilder();
    final Student std1 = student1Builder
            .build();
    @Override
    public Student getByStudentIdx(int StudentIdx) {
        return std1;
    }
}
