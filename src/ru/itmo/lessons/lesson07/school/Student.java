package ru.itmo.lessons.lesson07.school;

public class Student extends Person implements ILearn{
    private String subject; //изучаемый предмет
    private int level;

    public Student(String name, String subj){
        super(name);
        this.subject = subj;
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

    @Override
    public void setAge(int studentAge){
        if(studentAge < 7){
            throw new IllegalArgumentException("age < 7");
        }
        this.age = studentAge;
    }

    @Override
    public void rest(){
        System.out.println("Студент отдыхает");
    }

    @Override
    public void learn (int level){
        System.out.println("Студент  " + name + " изучает " + subject
                + " и ему кажется что уровень преподавателя " + level);
        this.level = (int) (Math.random() * level);
    }

}
