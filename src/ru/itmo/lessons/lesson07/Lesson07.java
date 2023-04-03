package ru.itmo.lessons.lesson07;
import ru.itmo.lessons.lesson07.school.Person;
import ru.itmo.lessons.lesson07.school.Student;
import ru.itmo.lessons.lesson07.school.Teacher;
import ru.itmo.lessons.lesson07.school.Headmaster;
public class Lesson07 {

    //Static со свойствами с методами с классами (только со вложенных) static блоки
    //static метод если он фабричный (создает объекты) или если метод вспомогательный
    public static void main(String[] args) {
        Mouse miccy = Mouse.getMouse();
        Cat cat01 = new Cat(16, 1);
        cat01.setName("Grischa");
        Student student01 = new Student ("Марк", "Химия");
        student01.setAge(12);


        Teacher teacher01 = new Teacher("Биология", 10, "Олег Иванович");
        teacher01.setAge(30);

        Person student02 = new Student ("Оля", "Алгебра");
        Person teacher02 = new Teacher("География", 14, "Григорий Петрович");

        //Общий тип данных используется для хранения объектов в массивах коллекциях и т.д
        Person [] people = {student02, student01, teacher02, teacher01};
        System.out.println("Перечисление того кто как отдыхает:");
        for (Person person: people ) {
            person.rest();
        }

        System.out.println();
        for (Person person: people ) {
            if(person instanceof Student){
                System.out.println( "Студент изучает предмет " + ((Student) person).getSubject());
            }
        }
        
        Headmaster headmaster = new Headmaster();
        headmaster.invite(student01);
        headmaster.invite(student02);
        headmaster.invite(teacher01);
        headmaster.invite(teacher02);

        System.out.println();
        System.out.println();
        teacher01.teach(student01);
        System.out.println();
        teacher01.teach(student01);
        System.out.println();
        teacher01.teach(headmaster);

        //interfaces
    }
}
