package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {

    private int Univ_num;
    private String Univ_name;
    private int Univ_phone;
    private String Univ_addr;

    public UniversityBuilder setUniv_num(int univ_num) {
        this.Univ_num = univ_num;
        return this;
    }

    public UniversityBuilder setUniv_name(String univ_name) {
        this.Univ_name = univ_name;
        return this;
    }

    public UniversityBuilder setUniv_phone(int univ_phone) {
        this.Univ_phone = univ_phone;
        return this;
    }

    public UniversityBuilder setUniv_addr(String univ_addr) {
        this.Univ_addr = univ_addr;
        return this;
    }
    public University build(){
        return new University(this.Univ_num,this.Univ_name,this.Univ_phone,this.Univ_addr);
    }
}
