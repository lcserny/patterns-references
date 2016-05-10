package net.cserny.bridge;

/**
 * Created by user on 10.05.2016.
 */
public interface StackImpl
{
    void push(int i);

    int pop();

    int top();

    boolean isEmpty();

    boolean isFull();
}
