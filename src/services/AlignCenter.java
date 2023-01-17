package services;

import models.Paragraph;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraphObject) {
        System.out.println("########" + paragraphObject.getName() + "########");
    }
}