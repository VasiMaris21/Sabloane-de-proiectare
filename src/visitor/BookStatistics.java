package visitor;

import models.*;

public class BookStatistics implements Visitor {
    private int numarImagini, numarParagrafe, numarTabele;

    @Override
    public void visitBook(Book bookObject) {

    }

    @Override
    public void visitSection(Section sectionObject) {

    }

    @Override
    public void visitParagraph(Paragraph paragraphObject) {
        numarParagrafe += 1;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        numarImagini += 1;
    }

    @Override
    public void visitImage(Image imageObject) {
        numarImagini += 1;
    }

    @Override
    public void visitTable(Table tableObject) {
        numarTabele += 1;
    }

    @Override
    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("* * * Number of images: " + numarImagini);
        System.out.println("* * * Number of tables: " + numarTabele);
        System.out.println("* * * Number of paragraphs: " + numarParagrafe);
    }
}