package test;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unused", "MismatchedQueryAndUpdateOfCollection"})
public class An implements Element {
    private final String titluAn;
    private final List<Element> listaElemente;

    public An(String titluAn) {
        this.titluAn = titluAn;
        listaElemente = new ArrayList<>();
    }

    public String getTitluAn() {
        return titluAn;
    }

    @Override
    public void add(Element... obiectElement) {
        listaElemente.addAll(List.of(obiectElement));
    }

    @Override
    public void printElement() {
        System.out.println(titluAn);
    }

    @Override
    public void accept(Visitor visitorObject) {
        visitorObject.visitElement(this);
        listaElemente.forEach(elementCurent -> {
            elementCurent.accept(visitorObject);
        });
    }
}