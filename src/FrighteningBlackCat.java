import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FrighteningBlackCat implements BlackCat {

    private BufferedImage img = ImageIO.read(new File("src/resource/silhouette-5644257_960_720.png"));;
    private int xCoor = 900;
    private int yCoor = 550;
    private int width = 100;
    private int length = 150;
    private boolean show = true;

    public FrighteningBlackCat() throws IOException {
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
