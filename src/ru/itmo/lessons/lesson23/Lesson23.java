package ru.itmo.lessons.lesson23;

public class Lesson23 {
    public static void main(String[] args) {
        Resource res = null;
        Resource resource = null;
        try {
            resource = new Resource();
            // использование ресурса
        } catch (Exception e) {
            // обработка возникающих исключений
        }
        finally {
            resource.close();
        }

        // в java 7 появился try with resources
        try (Resource authoclosableResource = new Resource()) {
            // использование ресурса
        } catch (Exception e) {
            // обработка возникающих исключений
        }
    }
}
