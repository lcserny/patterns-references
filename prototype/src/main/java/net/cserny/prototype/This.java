package net.cserny.prototype;

/**
 * Created by user on 06.05.2016.
 * 5. Sign-up for the clone() contract.
 * Each class calls "new" on itself FOR the client.
 */
public class This implements Prototype, Command
{
    @Override
    public void execute()
    {
        System.out.println("This:execute");
    }

    @Override
    public String getName()
    {
        return "This";
    }

    public Object clone()
    {
        return new This();
    }
}
