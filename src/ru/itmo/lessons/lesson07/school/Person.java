package ru.itmo.lessons.lesson07.school;

public class Person {
    protected String name;
    protected int age;

    public Person(String name){
        setName(name);
    }

    public void setName(String name){
        if(name == null || name.length() < 3){
            throw new IllegalArgumentException(" Wrong name");
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setAge(int age) {
        if(age > 0){
            throw new IllegalArgumentException("age < 0");
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }


}
