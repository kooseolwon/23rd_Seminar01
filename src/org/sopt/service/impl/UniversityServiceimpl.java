package org.sopt.service.impl;

import org.sopt.model.University;
import org.sopt.model.builder.UniversityBuilder;
import org.sopt.service.UniversityService;

public class UniversityServiceimpl implements UniversityService {
    final UniversityBuilder univ1Builder = new UniversityBuilder();
    final University univ1 = univ1Builder.build();

    @Override
    public University getByUniversityName(String Univ_name) {
        return univ1;
    }
}
