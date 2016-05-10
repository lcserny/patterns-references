package net.cserny.bridge.vtwo;

/**
 * Created by user on 10.05.2016.
 */
public abstract class Shape
{
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI)
    {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
