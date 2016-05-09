package net.cserny.factorymethod;

import java.io.InputStream;

/**
 * Created by user on 09.05.2016.
 */
public class GifReader implements ImageReader
{
    private DecodedImage decodedImage;

    public GifReader(InputStream inputStream)
    {
        // check that it's a Gif, throw Exception if it's not, then if it is, decode it.
    }

    @Override
    public DecodedImage getDecodedImage()
    {
        decodedImage = new DecodedImage("GIF");
        return decodedImage;
    }
}
