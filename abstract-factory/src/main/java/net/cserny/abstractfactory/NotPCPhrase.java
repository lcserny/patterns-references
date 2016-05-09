package net.cserny.abstractfactory;

/**
 * Created by user on 09.05.2016.
 */
public class NotPCPhrase extends Expression
{
    public static String[] list = {"pet", "short", "lie", "old"};
    private static int next = 0;

    public NotPCPhrase()
    {
        super(list[next]);
        next = (next + 1) % list.length;
    }

    @Override
    public Expression cloan()
    {
        return new NotPCPhrase();
    }
}
