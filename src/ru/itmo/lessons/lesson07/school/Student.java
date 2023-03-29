package ru.itmo.lessons.lesson07.school;

public class Student extends Person{
    private String subject; //изучаемый предмет
    private int level;

    public Student(String name){
        super(name);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if(subject == null || subject.length() < 2){
            throw new IllegalArgumentException("subject is invalid (null or too short)");
        }
        this.subject = subject;
    }

    public int getLevel() {
        return level;
    }


}
