package net.cserny.builder;

/**
 * Created by user on 06.05.2016.
 */
public class BuilderApp
{
    public static void main(String[] args)
    {
        Waiter waiter = new Waiter();

        waiter.setPizzaBuilder(new HawaiianPizzaBuilder());
        waiter.constructPizza();
        Pizza hawaiianPizza = waiter.getPizza();

        waiter.setPizzaBuilder(new SpicyPizzaBuilder());
        waiter.constructPizza();
        Pizza spicyPizza = waiter.getPizza();

        System.out.println(hawaiianPizza);
        System.out.println(spicyPizza);
    }
}
