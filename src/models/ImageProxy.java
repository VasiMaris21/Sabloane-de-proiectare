package models;

import visitor.Visitor;

import java.awt.*;

@SuppressWarnings("unused")
public class ImageProxy implements Element, Picture {
    private final String url;
    private Dimension dim;
    private Image imageObject;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage() {
        if (imageObject == null) {
            imageObject = new Image(url);
        }
        return imageObject;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int indexulElementului) {
        return null;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return dim;
    }

    @Override
    public PictureContent content() {
        return imageObject.content();
    }

    @Override
    public void accept(Visitor visitorObject) {
        visitorObject.visitImageProxy(this);
    }
}