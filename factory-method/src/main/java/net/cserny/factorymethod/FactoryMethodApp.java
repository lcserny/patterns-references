package net.cserny.factorymethod;

/**
 * Created by user on 09.05.2016.
 */
public class FactoryMethodApp
{
    public static void main(String[] args)
    {
        ImageReader reader;
        if (args.length > 0) {
            reader = new GifReader(System.in);
        } else {
            reader = new JpegReader();
        }

        System.out.println(reader.getDecodedImage());
    }
}
