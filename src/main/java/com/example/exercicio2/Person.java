package com.example.exercicio2;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Email> emails;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.emails = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void addEmail(Email email) {
        this.emails.add(email);
    }
}
