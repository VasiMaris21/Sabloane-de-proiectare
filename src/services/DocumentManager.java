package services;

import models.Book;

public class DocumentManager {
    private static DocumentManager documentManager = null;
    private Book bookObject;

    public static DocumentManager getInstance() {
        if (DocumentManager.documentManager == null) {
            documentManager = new DocumentManager();
        }
        return DocumentManager.documentManager;
    }

    public Book getBook() {
        return bookObject;
    }

    public void setBook(Book bookObject) {
        this.bookObject = bookObject;
    }
}