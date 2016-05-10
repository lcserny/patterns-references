package net.cserny.adapter.versionone;

/**
 * Created by user on 10.05.2016.
 */
public class AdapterApp
{
    public static void main(String[] args)
    {
        RoundHole roundHole = new RoundHole(5);
        SquarePegAdapter squarePegAdapter;

        for (int i = 0; i < 10; i++) {
            squarePegAdapter = new SquarePegAdapter((double) i);
            squarePegAdapter.makeFit(roundHole);
        }
    }
}
