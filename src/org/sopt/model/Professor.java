package org.sopt.model;

public class Professor extends Department{
    private int prof_num;
    private String prof_name;
    private String prof_major;
    private int prof_phone;
    private String subject;
    public Professor(){

    }
    public Professor(int prof_num, String prof_name, String prof_major, int prof_phone, String subject) {
        super();
        this.prof_num = prof_num;
        this.prof_name = prof_name;
        this.prof_major = prof_major;
        this.prof_phone = prof_phone;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "prof_num=" + prof_num +
                ", prof_name='" + prof_name + '\'' +
                ", prof_major='" + prof_major + '\'' +
                ", prof_phone=" + prof_phone +
                ", subject='" + subject + '\'' +
                '}';
    }

    public int getProf_num() {
        return prof_num;
    }

    public void setProf_num(int prof_num) {
        this.prof_num = prof_num;
    }

    public String getProf_name() {
        return prof_name;
    }

    public void setProf_name(String prof_name) {
        this.prof_name = prof_name;
    }

    public String getProf_major() {
        return prof_major;
    }

    public void setProf_major(String prof_major) {
        this.prof_major = prof_major;
    }

    public int getProf_phone() {
        return prof_phone;
    }

    public void setProf_phone(int prof_phone) {
        this.prof_phone = prof_phone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
