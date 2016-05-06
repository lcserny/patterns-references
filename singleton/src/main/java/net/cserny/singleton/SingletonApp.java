package net.cserny.singleton;

/**
 * Created by user on 06.05.2016.
 */
public class SingletonApp
{
    public static void main(String[] args)
    {
        Singleton firstSingleton = Singleton.getInstance();
        firstSingleton.setNumber(5);
        Singleton secondSingleton = Singleton.getInstance();
        secondSingleton.setNumber(7);


        System.out.println(firstSingleton.getNumber());
        System.out.println(secondSingleton.getNumber());
    }
}
