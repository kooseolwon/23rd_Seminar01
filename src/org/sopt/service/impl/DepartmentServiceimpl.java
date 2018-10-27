package org.sopt.service.impl;

import org.sopt.model.Department;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.service.DepartmentService;

public class DepartmentServiceimpl implements DepartmentService {
    final DepartmentBuilder depBuilder = new DepartmentBuilder();
    final Department dep1 = depBuilder
            .build();

    @Override
    public Department getByDepName(String dep_name) {
        return dep1;
        }
}
