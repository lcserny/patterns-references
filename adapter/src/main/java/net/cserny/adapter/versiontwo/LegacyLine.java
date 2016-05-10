package net.cserny.adapter.versiontwo;

/**
 * Created by user on 10.05.2016.
 */
public class LegacyLine
{
    public void draw(int x1, int y1, int x2, int y2)
    {
        System.out.println(String.format("Line from (%d,%d) to (%d,%d)", x1, y1, x2, y2));
    }
}
