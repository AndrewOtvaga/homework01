package com.company.project.homework20;

import java.time.LocalDate;
import java.util.Objects;

public class Student {


    public enum Sex {
        MALE, FEMALE
    }

    private int number; // уникальное значение для каждого ученика
    private String name;
    private Sex sex;
    private LocalDate birth;

    public Student(int number, String name, Sex sex, LocalDate birth) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student pupil = (Student) o;
        return number == pupil.number && Objects.equals(name, pupil.name) && sex == pupil.sex && Objects.equals(birth, pupil.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, sex, birth);
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birth=" + birth +
                '}';
    }
}