package net.cserny.prototype.vtwo;

/**
 * Created by user on 06.05.2016.
 */
public class PrototypeApp
{
    public static void main(String[] args)
    {
        for (String arg : args) {
            System.out.println(Factory.makeObject(arg));
        }
    }
}
