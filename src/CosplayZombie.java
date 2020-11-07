import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CosplayZombie implements Zombie {
    private BufferedImage img = ImageIO.read(new File("src/resource/mummy-egypt.png"));;
    private int xCoor = 680;
    private int yCoor = 330;
    private int width = 70;
    private int length = 80;
    private boolean show =  true;


    public CosplayZombie() throws IOException {
    }


    @Override
    public BufferedImage getImg() {
        return this.img;
    }

    @Override
    public void setImg(BufferedImage img) {
        this.img = img;
    }

    @Override
    public int getxCoor() {
        return this.xCoor;
    }

    @Override
    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }

    @Override
    public int getyCoor() {
        return this.yCoor;
    }

    @Override
    public void setyCoor(int yCoor) {
        this.yCoor = yCoor;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean isShow() {
        return show;
    }

    @Override
    public void setShow(boolean show) {
        this.show = show;
    }
}
