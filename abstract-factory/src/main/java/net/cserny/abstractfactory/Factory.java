package net.cserny.abstractfactory;

/**
 * Created by user on 09.05.2016.
 */
public abstract class Factory
{
    protected Expression prototype = null;

    public Expression makePhrase()
    {
        return prototype.cloan();
    }

    public abstract Expression makeCompromise();

    public abstract Expression makeGrade();
}
