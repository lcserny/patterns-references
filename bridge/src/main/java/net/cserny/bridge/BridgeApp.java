package net.cserny.bridge;

import java.util.Random;

/**
 * Created by user on 10.05.2016.
 */
public class BridgeApp
{
    public static void main(String[] args)
    {
        Stack[] stacks = {
            new Stack( "array" ),
            new Stack( "list" ),
            new StackFIFO(),
            new StackHanoi()
        };

        for (int i = 1, num; i < 15; i++) {
            for (int j=0; j < 3; j++) {
                stacks[j].push( i );
            }
        }

        Random rn = new Random();
        for (int i=1, num; i < 15; i++) {
            stacks[3].push( rn.nextInt(20) );
        }

        for (int i = 0, num; i < stacks.length; i++) {
            while (!stacks[i].isEmpty()) {
                System.out.print( stacks[i].pop() + "  " );
            }
            System.out.println();
        }

        System.out.println("Total rejected is " + ((StackHanoi)stacks[3]).reportRejected() );
    }
}
