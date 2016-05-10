package net.cserny.bridge.vone;

/**
 * Created by user on 10.05.2016.
 */
public class StackFIFO extends Stack
{
    private StackImpl temp = new StackList();

    public StackFIFO(String s)
    {
        super(s);
    }

    public StackFIFO()
    {
        super("array");
    }

    public int pop()
    {
        while (!isEmpty()) {
            temp.push(super.pop());
        }

        int ret = temp.pop();
        while (!temp.isEmpty()) {
            push(temp.pop());
        }

        return ret;
    }
}
