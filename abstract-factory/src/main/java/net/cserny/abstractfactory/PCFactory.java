package net.cserny.abstractfactory;

/**
 * Created by user on 09.05.2016.
 */
public class PCFactory extends Factory
{
    public PCFactory()
    {
        prototype = new PCPhrase();
    }

    @Override
    public Expression makeCompromise()
    {
        return new Expression("do it your way, any way or no way");
    }

    @Override
    public Expression makeGrade()
    {
        return new Expression("take tests, deal with the results");
    }
}
