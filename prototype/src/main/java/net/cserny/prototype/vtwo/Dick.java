package net.cserny.prototype.vtwo;

/**
 * Created by user on 06.05.2016.
 */
public class Dick implements Clonable
{
    @Override
    public Clonable clone()
    {
        return new Dick();
    }

    @Override
    public String toString()
    {
        return "Dick";
    }
}
