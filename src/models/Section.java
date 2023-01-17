package models;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    protected final String sectionTitle;
    private final List<Element> listOfelements;

    public Section(String sectionTitle) {
        this.sectionTitle = sectionTitle;
        this.listOfelements = new ArrayList<>();
    }

    @Override
    public void add(Element elementObject) {
        listOfelements.add(elementObject);
    }

    @Override
    public void remove(Element elementObject) {
        listOfelements.remove(elementObject);
    }

    @Override
    public Element get(int indexOfElement) {
        return listOfelements.get(indexOfElement);
    }

    @Override
    public void print() {
        System.out.println(sectionTitle);
        listOfelements.forEach(Element::print);
    }

    @Override
    public void accept(Visitor visitorObject) {
        visitorObject.visitSection(this);
        listOfelements.forEach(elementCurent -> elementCurent.accept(visitorObject));
    }
}