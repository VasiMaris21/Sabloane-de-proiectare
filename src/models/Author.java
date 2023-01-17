package models;

public class Author {
    private final String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public void print() {
        System.out.println("Author: " + authorName);
    }
}