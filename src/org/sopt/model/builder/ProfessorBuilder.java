package org.sopt.model.builder;

import org.sopt.model.Professor;

public class ProfessorBuilder {
    private int prof_num;
    private String prof_name;
    private String prof_major;
    private int prof_phone;
    private String subject;

    public ProfessorBuilder setProf_num(int prof_num) {
        this.prof_num = prof_num;
        return this;
    }

    public ProfessorBuilder setProf_name(String prof_name) {
        this.prof_name = prof_name;
        return this;
    }

    public ProfessorBuilder setProf_major(String prof_major) {
        this.prof_major = prof_major;
        return this;
    }

    public ProfessorBuilder setProf_phone(int prof_phone) {
        this.prof_phone = prof_phone;
        return this;
    }

    public ProfessorBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public Professor build(){
        return new Professor(this.prof_num,this.prof_name,this.prof_major,this.prof_phone,this.subject);
    }
}
