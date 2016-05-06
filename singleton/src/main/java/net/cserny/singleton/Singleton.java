package net.cserny.singleton;

/**
 * Created by user on 06.05.2016.
 */
public class Singleton
{
    // Private constructor prevents instantiation from other classes
    private Singleton() {}

    // For testing purposes
    public int number;

    /**
     * SingletonHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to SingletonHolder.INSTANCE, not before.
     */
    private static class SingletonHolder
    {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance()
    {
        return SingletonHolder.INSTANCE;
    }
}
