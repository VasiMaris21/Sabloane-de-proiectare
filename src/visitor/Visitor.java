package visitor;

import models.*;

public interface Visitor {
    void visitBook(Book bookObject);
    void visitSection(Section sectionObject);
//    void visitTableOfContent(TableOfContent tableOfContent);
    void visitParagraph(Paragraph paragraphObject);
    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image imageObject);
    void visitTable(Table tableObject);

    void printStatistics();
}