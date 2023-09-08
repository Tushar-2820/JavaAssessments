//Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.

import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getBooktitle() {
        return title;
    }

    public String getBookAuthor() {
        return author;
    }
}

class Library {

    ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public ArrayList<Book> getCollections() {
        return books;
    }

}

// class Main {
// public static void main(String[] args) {
// Book b1 = new Book("Alice in Wonderland", "Lewis Carrol");
// Book b2 = new Book("Adventures of Sherlock Holmes", " Arthur Conan Doyle");
// Library l1 = new Library();
// l1.addBook(b1);
// l1.addBook(b2);
// // System.out.println(l1.getCollections().get(1).getBooktitle());

// l1.removeBook(b2);
// System.out.println(l1.getCollections().get(0).getBooktitle());

// }
// }