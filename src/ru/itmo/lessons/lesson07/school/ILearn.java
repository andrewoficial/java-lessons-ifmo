package ru.itmo.lessons.lesson07.school;

public interface ILearn {
    //могут содержать константы
    //могут содержать static методы с реализацией
    //могут содержать реализации методов если перед ними стоит default



    default public void defaultLearning(){
        System.out.println("Дефолтная реализация метода обучения из интерфейса ILearn");
    }
    //методы без реализации (абстрактные)
    public void learn(int level);
}
