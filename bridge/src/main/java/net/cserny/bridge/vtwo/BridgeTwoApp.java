package net.cserny.bridge.vtwo;

/**
 * Created by user on 10.05.2016.
 */
public class BridgeTwoApp
{
    public static void main(String[] args)
    {
        Shape redCircle = new Circle(new RedCircle(), 100, 100, 10);
        Shape greenCircle = new Circle(new GreenCircle(), 100, 100, 10);

        redCircle.draw();
        greenCircle.draw();
    }
}
