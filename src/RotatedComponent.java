import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RotatedComponent implements Component{
    private BufferedImage img ;
    private int xCoor ;
    private int yCoor ;
    private int width ;
    private int length ;
    private boolean show =  true;


    public RotatedComponent(String filePath, int xCoor,int yCoor,int width,int length,int degree) throws IOException {
        this.xCoor=xCoor;
        this.yCoor=yCoor;
        this.width=width;
        this.length=length;
        this.img = ImageIO.read(new File(filePath));
        AffineTransform tx = new AffineTransform();
        tx.rotate(Math.toRadians(degree), this.img.getWidth() / 2, this.img.getHeight() / 2);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        this.img = op.filter(this.img, null);
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
