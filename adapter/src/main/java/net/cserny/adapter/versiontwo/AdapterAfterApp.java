package net.cserny.adapter.versiontwo;

/**
 * Created by user on 10.05.2016.
 */
public class AdapterAfterApp
{
    public static void main(String[] args)
    {
        Shape[] shapes = {new Line(), new Rectangle()};
        int x1 = 10, x2 = 20;
        int y1 = 30, y2 = 60;

        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}
