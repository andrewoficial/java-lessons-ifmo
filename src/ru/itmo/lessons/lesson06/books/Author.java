package ru.itmo.lessons.lesson06.books;

public class Author {

        public String name;
        public String surname;

        //Методы
        public String getFullName() {
                String fullName = name + " " + surname;
                return fullName;
        }

        public void printFullName() {
                System.out.println(name + " " + surname);
        }
}