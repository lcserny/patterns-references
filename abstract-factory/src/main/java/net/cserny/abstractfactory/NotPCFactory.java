package net.cserny.abstractfactory;

/**
 * Created by user on 09.05.2016.
 */
public class NotPCFactory extends Factory
{
    public NotPCFactory()
    {
        prototype = new NotPCPhrase();
    }

    @Override
    public Expression makeCompromise()
    {
        return new Expression("my way or the highway");
    }

    @Override
    public Expression makeGrade()
    {
        return new Expression("take tests, deal with the results");
    }
}
