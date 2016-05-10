package net.cserny.bridge.vone;

/**
 * Created by user on 10.05.2016.
 */
public class StackArray implements StackImpl
{
    private int[] items = new int[12];
    private int total = -1;

    @Override
    public void push(int i)
    {
        if (!isFull()) {
            items[++total] = i;
        }
    }

    @Override
    public int pop()
    {
        if (isEmpty()) {
            return -1;
        }
        return items[total--];
    }

    @Override
    public int top()
    {
        if (isEmpty()) {
            return -1;
        }
        return items[total];
    }

    @Override
    public boolean isEmpty()
    {
        return total == -1;
    }

    @Override
    public boolean isFull()
    {
        return total == 11;
    }
}
