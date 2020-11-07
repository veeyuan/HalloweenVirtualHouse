import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LivingRoomBasicPanel extends JPanel {
    public static final String BG_IMG_PATH = "src/resource/wallpaper-slides.png";
    private BufferedImage backgroundImg  = ImageIO.read(new File(BG_IMG_PATH));
    private List<Component> basicComponentList = new ArrayList<Component>();


    private String mode = "celebration";
    private AbstractModeFactory factory =  new CelebratingModeFactory();

    public LivingRoomBasicPanel() throws IOException {
        basicComponentList.add(new BasicComponent("src/resource/bats.png",660,217,65,30));
        basicComponentList.add(new BasicComponent("src/resource/open-window-4167496_1920.png",515,185,370,240));
        basicComponentList.add(new BasicComponent("src/resource/crow.png",540,370,55,45));
        basicComponentList.add(new BasicComponent("src/resource/coffin.png",1000,250,200,400));
        basicComponentList.add(new BasicComponent("src/resource/lady-vampire.png",1040,365,130,280));
        basicComponentList.add(new BasicComponent("src/resource/vase-orang2.png",1100,500,100,160));
        basicComponentList.add(new BasicComponent("src/resource/sofa.png",400,430,600,230));
        basicComponentList.add(new BasicComponent("src/resource/table.png",490,510,430,160));
        basicComponentList.add(new BasicComponent("src/resource/chair-maroon.png",200,380,230,250));
        basicComponentList.add(new BasicComponent("src/resource/witch-5625944_960_720.png",80,410,90,150));
        basicComponentList.add(new BasicComponent("src/resource/stool.png",185,560,100,80));
        basicComponentList.add(new BasicComponent("src/resource/lantern.png",205,520,30,50));
        basicComponentList.add(new BasicComponent("src/resource/eyeball.png",235,560,15,13));
        basicComponentList.add(new BasicComponent("src/resource/picture-frame.png",185,150,200,200));
        basicComponentList.add(new BasicComponent("src/resource/antique-lamp.png",150,0,70,120));
        basicComponentList.add(new BasicComponent("src/resource/antique-lamp.png",350,0,70,120));
        basicComponentList.add(new BasicComponent("src/resource/antique-lamp.png",1000,0,70,120));
        basicComponentList.add(new BasicComponent("src/resource/antique-lamp.png",1200,0,70,120));


    }

    @Override
    public Dimension getPreferredSize() {
        if (backgroundImg == null || isPreferredSizeSet()) {
            return super.getPreferredSize();
        } else {
            int w = backgroundImg.getWidth();
            int h = backgroundImg.getHeight();
            return new Dimension(w, h);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImg != null) {
            g.drawImage(backgroundImg,  0, 0, 1400, 800,null);
        }
        if (mode.equalsIgnoreCase("scary")){
            try {
                factory = new ScaryModeFactory();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try {
                factory = new CelebratingModeFactory();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<Component> windowList  = factory.getPreSettingList();
        for (int i =0;i<windowList.size();i++){
            Component component = windowList.get(i);
            g.drawImage(component.getImg(),component.getxCoor(),component.getyCoor(),component.getWidth(),component.getLength(),this);
        }

        for (int i =0;i<basicComponentList.size();i++){
            Component component = basicComponentList.get(i);
            g.drawImage(component.getImg(),component.getxCoor(),component.getyCoor(),component.getWidth(),component.getLength(),this);
        }

        List<Component> componentList  = factory.getComponentList();
        for (int i =0;i<componentList.size();i++){
            Component component = componentList.get(i);
            g.drawImage(component.getImg(),component.getxCoor(),component.getyCoor(),component.getWidth(),component.getLength(),this);
        }
    }

    public void setMode(String mode) {
        this.mode = mode;
    }


}
