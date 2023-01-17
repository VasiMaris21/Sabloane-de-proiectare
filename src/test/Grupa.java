package test;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Grupa implements Element {
    private final String titluGrupa;
    private final List<Element> listaElemente;

    public Grupa(String titluGrupa) {
        this.titluGrupa = titluGrupa;
        listaElemente = new ArrayList<>();
    }

    public String getTitluGrupa() {
        return titluGrupa;
    }

    @Override
    public void add(Element... obiectElement) {
        listaElemente.addAll(List.of(obiectElement));
    }

    @Override
    public void printElement() {
        System.out.println("\t" + titluGrupa);
    }

    public List<Element> getListaElemente() {
        return listaElemente;
    }

    @Override
    public void accept(Visitor visitorObject) {
        visitorObject.visitElement(this);
        listaElemente.forEach(elementCurent -> elementCurent.accept(visitorObject));
    }
}