package net.cserny.adapter.versiontwo;

/**
 * Created by user on 10.05.2016.
 */
public class Line implements Shape
{
    private LegacyLine adaptee;

    public Line()
    {
        adaptee = new LegacyLine();
    }

    @Override
    public void draw(int x1, int x2, int y1, int y2)
    {
        adaptee.draw(x1, y1, x2, y2);
    }
}
