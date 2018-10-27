package org.sopt.model;

public class University {

    private int Univ_num;

    private String Univ_name;
    private int Univ_phone;
    private String Univ_addr;

    public University(){

    }

    public University(int univ_num, String univ_name, int univ_phone, String univ_addr) {
        Univ_num = univ_num;
        Univ_name = univ_name;
        Univ_phone = univ_phone;
        Univ_addr = univ_addr;
    }

    @Override
    public String toString() {
        return "University{" +
                "Univ_num=" + Univ_num +
                ", Univ_name='" + Univ_name + '\'' +
                ", Univ_phone=" + Univ_phone +
                ", Univ_addr='" + Univ_addr + '\'' +
                '}';
    }

    public int getUniv_num() {
        return Univ_num;
    }

    public void setUniv_num(int univ_num) {
        Univ_num = univ_num;
    }

    public String getUniv_name() {
        return Univ_name;
    }

    public void setUniv_name(String univ_name) {
        Univ_name = univ_name;
    }

    public int getUniv_phone() {
        return Univ_phone;
    }

    public void setUniv_phone(int univ_phone) {
        Univ_phone = univ_phone;
    }

    public String getUniv_addr() {
        return Univ_addr;
    }

    public void setUniv_addr(String univ_addr) {
        Univ_addr = univ_addr;
    }
}
