package test;

public class PrintVisitor implements Visitor {

    @Override
    public void visitElement(Element elementObject) {
        elementObject.printElement();
    }
}