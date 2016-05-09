package net.cserny.abstractfactory;

/**
 * Created by user on 09.05.2016.
 */
public class Expression
{
    protected String text;

    public Expression(String text)
    {
        this.text = text;
    }

    public Expression cloan()
    {
        return null;
    }

    @Override
    public String toString()
    {
        return "Expression{" +
            "text='" + text + '\'' +
            '}';
    }
}
