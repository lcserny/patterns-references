package net.cserny.prototype.vtwo;

/**
 * Created by user on 06.05.2016.
 */
public class Harry implements Clonable
{
    @Override
    public Clonable clone()
    {
        return new Harry();
    }

    @Override
    public String toString()
    {
        return "Harry";
    }
}
