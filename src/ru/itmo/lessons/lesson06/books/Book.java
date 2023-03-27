package ru.itmo.lessons.lesson06.books;

public class Book {


    private String title;

    private Author author;
    public void setAuthor(Author newAuthor) {
        if(newAuthor == null){
            throw new IllegalArgumentException("Author cant be null");
        }
        author = newAuthor;
    }



    public void setTitle(String bookTitle){
        if(bookTitle != null && bookTitle.length() < 3){
            throw new IllegalArgumentException("Title must be more than 3 symbol");
        }
        title = bookTitle;
    }


    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
