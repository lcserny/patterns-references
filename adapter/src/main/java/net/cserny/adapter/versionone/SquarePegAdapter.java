package net.cserny.adapter.versionone;

/**
 * Created by user on 10.05.2016.
 */
public class SquarePegAdapter
{
    private SquarePeg squarePeg;

    public SquarePegAdapter(double width)
    {
        squarePeg = new SquarePeg(width);
    }

    public void makeFit(RoundHole roundHole)
    {
        double amount = squarePeg.getWidth() - roundHole.getRadius() * Math.sqrt(2);
        System.out.println(String.format("Reducing SquarePeg %s by %s amount",
            squarePeg.getWidth(),
            amount < 0 ? 0 : amount
        ));

        if (amount > 0) {
            squarePeg.setWidth(squarePeg.getWidth() - amount);
            System.out.println("\twidth is now " + squarePeg.getWidth());
        }
    }
}
