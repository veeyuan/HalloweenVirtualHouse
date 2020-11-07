import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CelebratingModeFactory implements AbstractModeFactory {
    private List<Component> celebratingPreSettingList = new ArrayList<Component>();
    private List<Component> celebratingComponentList = new ArrayList<Component>();
    public CelebratingModeFactory() throws IOException {
        celebratingComponentList.add(createBlackCat());
        celebratingComponentList.add(createCentralLight());
        celebratingPreSettingList.add(createNightScene());
        celebratingPreSettingList.add(createZombie());
        celebratingComponentList.add(createSpiderWeb());
        celebratingComponentList.add(createPictureInFrame());
        celebratingComponentList.addAll(createTableSettings().getTableDecorList());
    }
    @Override
    public List<Component> getPreSettingList() {
        return celebratingPreSettingList;
    }

    @Override
    public List<Component> getComponentList() {
        return celebratingComponentList;
    }

    @Override
    public BlackCat createBlackCat() throws IOException {
        return new CelebratingBlackCat();
    }

    @Override
    public CentralLight createCentralLight() throws IOException {
        return new ElegantLight();
    }

    @Override
    public NightScene createNightScene() throws IOException {
        return new StarryNightScene();
    }

    @Override
    public SpiderWeb createSpiderWeb() throws IOException {
        return new RightSpiderWeb();
    }

    @Override
    public Zombie createZombie() throws IOException {
        return new CosplayZombie();
    }

    @Override
    public PictureInFrame createPictureInFrame() throws IOException {
        return new ArtisticPictureInFrame();
    }

    @Override
    public BloodStains createBloodStains() throws IOException {
        return null;
    }

    @Override
    public TableSettings createTableSettings() throws IOException {
        return new CelebratingTableSettings();
    }

    @Override
    public Filter createFilter() throws IOException {
        return null;
    }


}
