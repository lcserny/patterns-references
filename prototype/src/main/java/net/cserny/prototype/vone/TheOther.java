package net.cserny.prototype.vone;

/**
 * Created by user on 06.05.2016.
 */
public class TheOther implements Prototype, Command
{
    @Override
    public void execute()
    {
        System.out.println("TheOther:execute");
    }

    @Override
    public String getName()
    {
        return "TheOther";
    }

    public Object clone()
    {
        return new TheOther();
    }
}
