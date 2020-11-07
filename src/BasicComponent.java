import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BasicComponent implements Component {
    private BufferedImage img ;
    private int xCoor ;
    private int yCoor ;
    private int width ;
    private int length ;
    private boolean show = true;

    public BasicComponent(String filePath,int xCoor,int yCoor,int width,int length) throws IOException {
        this.img = ImageIO.read(new File(filePath));
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        this.width = width;
        this.length = length;
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
