package org.sopt.model;

public class Department extends University {
    private int Dep_num;
    private String dep_name;
    private int dep_phone;
    private String dep_type;
    public Department(){

    }
    public Department(int dep_num, String dep_name, int dep_phone, String dep_type) {
        super();
        Dep_num = dep_num;
        this.dep_name = dep_name;
        this.dep_phone = dep_phone;
        this.dep_type = dep_type;
    }

    @Override
    public String toString() {
        return "Department{" +
                "Dep_num=" + Dep_num +
                ", dep_name='" + dep_name + '\'' +
                ", dep_phone=" + dep_phone +
                ", dep_type='" + dep_type + '\'' +
                '}';
    }

    public int getDep_num() {
        return Dep_num;
    }

    public void setDep_num(int dep_num) {
        Dep_num = dep_num;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public int getDep_phone() {
        return dep_phone;
    }

    public void setDep_phone(int dep_phone) {
        this.dep_phone = dep_phone;
    }

    public String getDep_type() {
        return dep_type;
    }

    public void setDep_type(String dep_type) {
        this.dep_type = dep_type;
    }
}
