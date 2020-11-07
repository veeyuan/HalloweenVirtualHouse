import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScaryModeFactory implements AbstractModeFactory {

    private List<Component> scaryPreSettingList = new ArrayList<Component>();
    private List<Component> scaryComponentList = new ArrayList<Component>();

    public ScaryModeFactory() throws IOException {
        scaryPreSettingList.add(createNightScene());
        scaryPreSettingList.addAll(createBloodStains().getBloodStainsList());
        scaryComponentList.add(createBlackCat());
        scaryComponentList.add(createCentralLight());
        scaryComponentList.add(createZombie());
        scaryComponentList.add(new BasicComponent("src/resource/cracked-1975573_1920.png",560,210,70,180));
        scaryComponentList.add(new BasicComponent("src/resource/cracked-1975573_1920.png",770,210,70,180));
        scaryComponentList.add(new RotatedComponent("src/resource/sorcerer-151168_1280.png",315,420,170,220,340));
        scaryComponentList.add(createPictureInFrame());
        scaryComponentList.add(createSpiderWeb());
        scaryComponentList.addAll(createTableSettings().getTableDecorList());
        scaryComponentList.addAll(createFilter().getFilterList());
    }

    @Override
    public List<Component> getPreSettingList() {
        return scaryPreSettingList;
    }

    public List<Component> getComponentList() {
        return scaryComponentList;
    }

    @Override
    public BlackCat createBlackCat() throws IOException {
        return new FrighteningBlackCat();
    }

    @Override
    public CentralLight createCentralLight() throws IOException {
        return new EvilCatLight();
    }

    @Override
    public NightScene createNightScene() throws IOException {
        return new ScaryNightScene();
    }

    @Override
    public SpiderWeb createSpiderWeb() throws IOException {
        return new LeftSpiderWeb();
    }

    @Override
    public Zombie createZombie() throws IOException {
        return new RealZombie();
    }

    @Override
    public PictureInFrame createPictureInFrame() throws IOException {
        return new ScaryPictureInFrame();
    }

    @Override
    public BloodStains createBloodStains() throws IOException {
        return new BloodStains();
    }

    @Override
    public TableSettings createTableSettings() throws IOException {
        return new ScaryTableSettings();
    }

    @Override
    public Filter createFilter() throws IOException {
        return new ScaryFilter();
    }
}
