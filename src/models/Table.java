package models;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Table implements Element {
    private final String numeleTabelei;
    private final List<Element> listOfElements;

    public Table(String numeleTabelei) {
        this.numeleTabelei = numeleTabelei;
        this.listOfElements = new ArrayList<>();
    }

    @Override
    public void add(Element elementObject) {
        listOfElements.add(elementObject);
    }

    @Override
    public void remove(Element elementObject) {
        listOfElements.remove(elementObject);
    }

    @Override
    public Element get(int indexOfElement) {
        return listOfElements.get(indexOfElement);
    }

    public void print() {
        System.out.println("Table with title: " + numeleTabelei);
    }

    @Override
    public void accept(Visitor visitorObject) {
        visitorObject.visitTable(this);
    }
}