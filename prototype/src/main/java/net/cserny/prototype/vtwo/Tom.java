package net.cserny.prototype.vtwo;

/**
 * Created by user on 06.05.2016.
 */
public class Tom implements Clonable
{
    @Override
    public Clonable clone()
    {
        return new Tom();
    }

    @Override
    public String toString()
    {
        return "Tom";
    }
}
