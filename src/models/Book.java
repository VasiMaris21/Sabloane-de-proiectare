package models;

import visitor.Visitee;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private final List<Author> listOfAuthors;
    private final List<Element> listOfElements;

    public Book(String bookTitle) {
        super(bookTitle);
        this.listOfAuthors = new ArrayList<>();
        this.listOfElements = new ArrayList<>();
    }

    public void print() {
        System.out.println("Book: " + sectionTitle + "\n\nAuthors:");
        listOfAuthors.forEach(Author::print);
        System.out.println();
        listOfElements.forEach(Element::print);
    }

    public void addAuthor(Author obiectAutor) {
        this.listOfAuthors.add(obiectAutor);
    }

    public void addContent(Element paragraphObject) {
        listOfElements.add(paragraphObject);
    }
}