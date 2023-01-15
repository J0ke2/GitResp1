package com.msb;

public class Student {
    private int age;
    private String name;
    private String sex;
    private int num;

    public Student(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
