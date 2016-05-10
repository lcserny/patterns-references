package net.cserny.bridge.vone;

/**
 * Created by user on 10.05.2016.
 */
public class StackHanoi extends Stack
{
    private int totalRejected = 0;

    public StackHanoi()
    {
        super("array");
    }

    public StackHanoi(String s)
    {
        super(s);
    }

    public int reportRejected()
    {
        return totalRejected;
    }

    public void push(int in)
    {
        if (!isEmpty() && in > top()) {
            totalRejected++;
        } else {
            super.push(in);
        }
    }
}
