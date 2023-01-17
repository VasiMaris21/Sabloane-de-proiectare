package services;

import models.Paragraph;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraphObject) {
        System.out.println("################" + paragraphObject.getName());
    }
}