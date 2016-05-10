package net.cserny.adapter.versiontwo;

/**
 * Created by user on 10.05.2016.
 */
public class AdapterBeforeApp
{
    public static void main(String[] args)
    {
        Object[] shapes = {new LegacyLine(), new LegacyRectangle()};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        for (Object shape : shapes) {
            if (shape instanceof LegacyLine) {
                LegacyLine line = (LegacyLine) shape;
                line.draw(x1, y1, x2, y2);
            } else if (shape instanceof LegacyRectangle) {
                LegacyRectangle rectangle = (LegacyRectangle) shape;
                rectangle.draw(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
            }
        }
    }
}
