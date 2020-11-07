import java.io.IOException;
import java.util.List;

public interface AbstractModeFactory {
    public List<Component> getPreSettingList();
    public List<Component> getComponentList();
    public BlackCat createBlackCat() throws IOException;
    public CentralLight createCentralLight()  throws IOException;
    public NightScene createNightScene() throws IOException;
    public SpiderWeb createSpiderWeb() throws IOException;
    public Zombie createZombie() throws IOException;
    public PictureInFrame createPictureInFrame() throws IOException;
    public BloodStains createBloodStains() throws IOException;
    public TableSettings createTableSettings() throws IOException;
    public Filter createFilter() throws IOException;

}
