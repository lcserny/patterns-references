package net.cserny.adapter.versiontwo;

/**
 * Created by user on 10.05.2016.
 */
public class Rectangle implements Shape
{
    private LegacyRectangle adaptee;

    public Rectangle()
    {
        adaptee = new LegacyRectangle();
    }

    @Override
    public void draw(int x1, int x2, int y1, int y2)
    {
        adaptee.draw(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
    }
}
