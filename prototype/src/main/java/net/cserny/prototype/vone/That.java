package net.cserny.prototype.vone;

/**
 * Created by user on 06.05.2016.
 */
public class That implements Prototype, Command
{
    @Override
    public void execute()
    {
        System.out.println("That:execute");
    }

    @Override
    public String getName()
    {
        return "That";
    }

    public Object clone()
    {
        return new That();
    }
}
