package net.cserny.prototype.vtwo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 06.05.2016.
 */
public class Factory
{
    private static Map<String, Clonable> prototypes = new HashMap<>();

    static {
        prototypes.put("tom", new Tom());
        prototypes.put("dick", new Dick());
        prototypes.put("harry", new Harry());
    }

    public static Clonable makeObject(String name)
    {
        return prototypes.get(name).clone();
    }
}
