package services;

import models.Paragraph;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraphObject) {
        System.out.println(paragraphObject.getName() + "################");
    }
}