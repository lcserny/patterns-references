package net.cserny.adapter.versionone;

/**
 * Created by user on 10.05.2016.
 */
public class RoundHole
{
    private int radius;

    public RoundHole(int radius)
    {
        this.radius = radius;
        System.out.println("RoundHole: max SquarePeg is " + radius * Math.sqrt(2));
    }

    public int getRadius()
    {
        return radius;
    }
}
