package net.cserny.bridge.vtwo;

/**
 * Created by user on 10.05.2016.
 */
public class GreenCircle implements DrawAPI
{
    @Override
    public void drawCircle(int radius, int x, int y)
    {
        System.out.println(String.format("Drawing circle [color: green, radius %d, x: %d, y: %d]", radius, x, y));
    }
}
