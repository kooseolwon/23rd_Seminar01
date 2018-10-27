package org.sopt.model.builder;

import org.sopt.model.Department;

public class DepartmentBuilder {
    private int dep_num;
    private String dep_name;
    private int dep_phone;
    private String dep_type;


    public DepartmentBuilder setDep_num(int dep_num) {
        this.dep_num = dep_num;
        return this;

    }

    public DepartmentBuilder setDep_name(String dep_name) {
        this.dep_name = dep_name;
        return this;
    }

    public DepartmentBuilder setDep_phone(int dep_phone) {
        this.dep_phone = dep_phone;
        return this;
    }

    public DepartmentBuilder setDep_type(String dep_type) {
        this.dep_type = dep_type;
        return this;
    }
    public Department build(){
        return new Department(this.dep_num,this.dep_name,this.dep_phone,this.dep_type);
    }
}
