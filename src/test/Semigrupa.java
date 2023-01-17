package test;

import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"MismatchedQueryAndUpdateOfCollection", "unused"})
public class Semigrupa implements Element {
    private final String titluSemigrupa;
    private final List<Element> listaElemente;
    public Semigrupa(String titluSemigrupa) {
        this.titluSemigrupa = titluSemigrupa;
        this.listaElemente = new ArrayList<>();
    }

    public String getTitluSemigrupa() {
        return titluSemigrupa;
    }

    @Override
    public void add(Element... obiectElement) {
        listaElemente.addAll(List.of(obiectElement));
    }

    @Override
    public void printElement() {
        System.out.println("\t\t" + titluSemigrupa);
    }

    @Override
    public void accept(Visitor visitorObject) {
        visitorObject.visitElement(this);
        listaElemente.forEach(elementCurent -> elementCurent.accept(visitorObject));
    }
}