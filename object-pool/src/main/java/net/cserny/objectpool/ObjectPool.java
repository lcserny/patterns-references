package net.cserny.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by user on 09.05.2016.
 */
public abstract class ObjectPool<T>
{
    private long expirationTime;
    private Hashtable<T, Long> locked, unlocked;

    public ObjectPool()
    {
        expirationTime = 30000; // 30 seconds
        locked = new Hashtable<>();
        unlocked = new Hashtable<>();
    }

    protected abstract T create();

    public abstract boolean validate(T object);

    public abstract void expire(T object);

    public synchronized T checkOut()
    {
        long now = System.currentTimeMillis();
        T object;

        if (unlocked.size() > 0) {
            Enumeration<T> enumeration = unlocked.keys();
            while (enumeration.hasMoreElements()) {
                object = enumeration.nextElement();
                if ((now - unlocked.get(object)) > expirationTime) {
                    unlocked.remove(object);
                    expire(object);
                    object = null;
                } else {
                    if (validate(object)) {
                        unlocked.remove(object);
                        locked.put(object, now);
                        return object;
                    } else {
                        unlocked.remove(object);
                        expire(object);
                        object = null;
                    }
                }
            }
        }

        object = create();
        locked.put(object, now);
        return object;
    }

    public synchronized void checkIn(T object)
    {
        locked.remove(object);
        unlocked.put(object, System.currentTimeMillis());
    }
}
