package net.cserny.abstractfactory;

/**
 * Created by user on 09.05.2016.
 */
public class PCPhrase extends Expression
{
    public static String[] list = {"animal companion", "vertically challenged",
        "factually inaccurate", "chronologically gifted"};
    private static int next = 0;

    public PCPhrase()
    {
        super(list[next]);
        next = (next + 1) % list.length;
    }

    @Override
    public Expression cloan()
    {
        return new PCPhrase();
    }
}
