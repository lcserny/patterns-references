package net.cserny.adapter.versiontwo;

/**
 * Created by user on 10.05.2016.
 */
public class LegacyRectangle
{
    public void draw(int x, int y, int w, int h)
    {
        System.out.println(String.format("Rectangle at (%d,%d) with width %d and height %d", x, y, w, h));
    }
}
