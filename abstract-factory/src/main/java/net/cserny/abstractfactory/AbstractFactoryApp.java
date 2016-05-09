package net.cserny.abstractfactory;

/**
 * Created by user on 09.05.2016.
 */
public class AbstractFactoryApp
{
    public static void main(String[] args)
    {
        Factory factory;
        if (args.length > 0) {
            factory = new PCFactory();
        } else {
            factory = new NotPCFactory();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(factory.makePhrase() + " ");
        }

        System.out.println();
        System.out.println(factory.makeCompromise());
        System.out.println(factory.makeGrade());
    }
}
