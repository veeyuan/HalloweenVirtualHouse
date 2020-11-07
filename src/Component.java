import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public  interface Component {

     public BufferedImage getImg();

     public void setImg(BufferedImage img);

     public int getxCoor();

     public void setxCoor(int xCoor);

     public int getyCoor();

     public void setyCoor(int yCoor);

     public int getWidth();

     public void setWidth(int width);

     public int getLength();

     public void setLength(int length);

     public boolean isShow();

     public void setShow (boolean show);



}
