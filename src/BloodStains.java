import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BloodStains  {
    private List<Component> bloodStainsList=new ArrayList<>();
    private String filePath ="src/resource/splatter-303569_1280.png";
    public BloodStains() throws IOException {
        bloodStainsList.add(new RotatedComponent(filePath,910,120,100,250,180));
        bloodStainsList.add(new RotatedComponent(filePath,440,560,55,170,135));
        bloodStainsList.add(new RotatedComponent(filePath,470,600,75,190,110));
        bloodStainsList.add(new RotatedComponent(filePath,500,500,55,170,90));
        bloodStainsList.add(new RotatedComponent(filePath,1050,520,300,300,300));
        bloodStainsList.add(new RotatedComponent(filePath,730,600,90,150,90));
        bloodStainsList.add(new RotatedComponent(filePath,400,540,115,250,120));
        bloodStainsList.add(new RotatedComponent(filePath,115,580,55,170,113));
        bloodStainsList.add(new RotatedComponent(filePath,250,570,69,230,283));
        bloodStainsList.add(new RotatedComponent(filePath,150,570,77,200,353));


    }

    public List<Component> getBloodStainsList() {
        return bloodStainsList;
    }
}
