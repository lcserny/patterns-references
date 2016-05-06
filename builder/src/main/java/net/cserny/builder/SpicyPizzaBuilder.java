package net.cserny.builder;

/**
 * Created by user on 06.05.2016.
 * Concrete Builder
 */
public class SpicyPizzaBuilder extends PizzaBuilder
{
    @Override
    public void buildDough()
    {
        pizza.setDough("pan baked");
    }

    @Override
    public void buildSauce()
    {
        pizza.setSauce("hot");
    }

    @Override
    public void buildTopping()
    {
        pizza.setTopping("pepperoni + salami");
    }
}
