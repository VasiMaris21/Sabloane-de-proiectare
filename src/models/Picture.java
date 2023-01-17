package models;

import java.awt.*;

@SuppressWarnings("unused")
public interface Picture {
    String url();
    Dimension dim();
    PictureContent content();
}