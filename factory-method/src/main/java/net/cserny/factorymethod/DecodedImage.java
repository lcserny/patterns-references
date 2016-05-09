package net.cserny.factorymethod;

/**
 * Created by user on 09.05.2016.
 */
public class DecodedImage
{
    private String type;

    public DecodedImage(String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "DecodedImage{" +
            "type='" + type + '\'' +
            '}';
    }
}
