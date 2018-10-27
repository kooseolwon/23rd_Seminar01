package org.sopt.model.builder;

import org.sopt.model.Student;

public class StudentBuilder {
    private int id;
    private String name;
    private int grade;
    private String major;
    private String email;
    private String addr;
    private int age;
    private String status;

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    public StudentBuilder setMajor(String major) {
        this.major = major;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setAddr(String addr) {
        this.addr = addr;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setStatus(String status) {
        this.status = status;
        return this;
    }
    public Student build(){
        return new Student(this.id,this.name,this.grade,
                this.major,this.email,this.addr,this.age,this.status);
    }

}
