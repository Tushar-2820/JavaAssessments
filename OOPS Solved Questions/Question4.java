//Question 4
//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.

import java.util.ArrayList;

class Question4 {
    private String title;
    private String author;
    private int ISBN;
    static ArrayList<Question4> bookcollection = new ArrayList<Question4>();

    public Question4(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuhtor(String author) {
        this.author = author;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    public static void addbook(Question4 book) {
        bookcollection.add(book);
    }

    public static void removebook(Question4 book) {
        bookcollection.remove(book);
    }

    public static ArrayList<Question4> getCollections() {
        return bookcollection;
    }

}

// class Main {
// public static void main(String[] args) {
// Question4 book1 = new Question4("The Great Gatsby", "Scott Fitzgerald", 101);
// Question4 book2 = new Question4("To Kill a Mockingbird", "Harper Lee", 102);
// Question4.addbook(book1);
// Question4.addbook(book2);

// ArrayList<Question4> bookCollection = Question4.getCollections();
// System.out.println("List of Books:");

// for (Question4 book : bookCollection) {
// System.out.println(book.getISBN());
// }

// }
// }