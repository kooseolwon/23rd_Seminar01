package org.sopt.model;

public class Student extends Department {
    private int id;
    private String name;
    private int grade;
    private String major;
    private String email;
    private String addr;
    private int age;
    private String status;

    public Student(int id, String name, int grade, String major, String email, String addr, int age, String status) {
        super();
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.major = major;
        this.email = email;
        this.addr = addr;
        this.age = age;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", major='" + major + '\'' +
                ", email='" + email + '\'' +
                ", addr='" + addr + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
