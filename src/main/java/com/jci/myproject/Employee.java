package com.jci.myproject;

import java.io.Serializable;

public class Employee implements Serializable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Name： " + getName() + ", Age: " + getAge();
    }
}
