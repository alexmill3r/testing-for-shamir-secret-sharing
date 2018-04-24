import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
/**
 * Write a description of class GetSetPixels here.
 *
 * @author Alexander Miller
 * @version (4/18/18)
 */

public class GetSetPixels
{
   public static void main(String args[])throws IOException{
    BufferedImage img = null;
    File f = null;

    //read image
    try{
      f = new File("/Users//alexmiller//Desktop//SSSDOG.jpg");
      img = ImageIO.read(f);
    }catch(IOException e){
      System.out.println(e);
    }
   

    

    //get pixel value
    int p = img.getRGB(0,0);

    //get alpha
    int a = (p>>24) & 0xff;

    //get red
    int r = (p>>16) & 0xff;

    //get green
    int g = (p>>8) & 0xff;

    //get blue
    int b = p & 0xff;

    a = 255;
    r = 100;
    g = 150;
    b = 200;

    //set the pixel value
    p = (a<<24) | (r<<16) | (g<<8) | b;
    img.setRGB(0, 0, p);

    //write image
    try{
      f = new File("//Users//alexmiller//Desktop//Output.jpg");
      ImageIO.write(img, "jpg", f);
    }catch(IOException e){
      System.out.println(e);
    }

  }//main() ends here
}//class ends here

