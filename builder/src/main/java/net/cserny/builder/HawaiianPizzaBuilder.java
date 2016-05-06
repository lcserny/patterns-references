package net.cserny.builder;

/**
 * Created by user on 06.05.2016.
 * Concrete Builder
 */
public class HawaiianPizzaBuilder extends PizzaBuilder
{
    @Override
    public void buildDough()
    {
        pizza.setDough("cross");
    }

    @Override
    public void buildSauce()
    {
        pizza.setSauce("mild");
    }

    @Override
    public void buildTopping()
    {
        pizza.setTopping("ham + pineapple");
    }
}
