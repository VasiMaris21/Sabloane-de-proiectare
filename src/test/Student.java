package test;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public record Student(String numePrenumeStudent, String emailStudent) implements Element {

    @Override
    public void add(Element... obiectElement) {
    }

    @Override
    public void printElement() {
        System.out.println("\t\t\t" + numePrenumeStudent + ", " + emailStudent);
    }

    @Override
    public void accept(@NotNull Visitor visitorObject) {
        visitorObject.visitElement(this);
    }
}