package models;

import visitor.Visitor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Image implements Element, Picture {
    private final String url;
    private final PictureContent pictureContent;
    private final List<Element> listOfElements;

    public Image(String url) {
        this.url = url;
        this.listOfElements = new ArrayList<>();
        pictureContent = new PictureContent();
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
        System.out.println("Image with name: " + url);
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return new Dimension();
    }

    @Override
    public PictureContent content() {
        return pictureContent;
    }

    @Override
    public void accept(Visitor visitorObject) {
        visitorObject.visitImage(this);
    }
}