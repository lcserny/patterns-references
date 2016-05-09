package net.cserny.factorymethod;

/**
 * Created by user on 09.05.2016.
 */
public class JpegReader implements ImageReader
{
    private DecodedImage decodedImage;

    @Override
    public DecodedImage getDecodedImage()
    {
        decodedImage = new DecodedImage("JPEG");
        return decodedImage;
    }
}
