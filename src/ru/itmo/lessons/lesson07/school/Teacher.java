package ru.itmo.lessons.lesson07.school;

public class Teacher extends  Person implements ITech{
    private final String subject;
    private int level;
    public Teacher (String subject, int level, String name){
        super(name);
        this.subject = subject;
        this.level = level;

    }

    public String getSubject(){
        return subject;
    }

    public int getLevel(){
        return level;
    }

    @Override
    public void setAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("age < 18");
        }
        this.age = age;
    }

    @Override
    public void rest(){
        System.out.println("Teacher rest");
    }

    @Override
    public void teach(ILearn arg) {
        System.out.println("Учитель "+ name + " по предмету " + subject + " посетил урок.");
        System.out.println("    Процесс обучения по умолчанию:");
        arg.defaultLearning();
        System.out.println("    Процесс обучения в контексте:");
        arg.learn(this.level);
    }
}
