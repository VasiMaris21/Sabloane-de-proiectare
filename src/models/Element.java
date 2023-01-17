package models;

import visitor.Visitee;

public interface Element extends Visitee {
    void add(Element elementObject);
    void remove(Element elementObject);
    Element get(int indexOfElement);
    void print();
}