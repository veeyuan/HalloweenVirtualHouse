import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScaryTableSettings implements TableSettings {
    private List<Component> tableDecorList = new ArrayList<>();

    public ScaryTableSettings() throws IOException {
        tableDecorList.add(new BasicComponent("src/resource/cat-toy.png",680,475,70,50));
        tableDecorList.add(new RotatedComponent("src/resource/splatter-303569_1280.png",625,500,200,90,300));
        tableDecorList.add(new BasicComponent("src/resource/candles.png",565,495,20,50));
        tableDecorList.add(new BasicComponent("src/resource/candles.png",595,490,20,50));
        tableDecorList.add(new BasicComponent("src/resource/candle-red-with-stand.png",575,500,30,60));
        tableDecorList.add(new BasicComponent("src/resource/poison-159083_960_720.png",725,500,40,50));
        tableDecorList.add(new BasicComponent("src/resource/poison-576608_960_720.png",735,535,20,30));
        tableDecorList.add(new BasicComponent("src/resource/poison-576608_960_720.png",715,528,20,30));
        tableDecorList.add(new BasicComponent("src/resource/pumpkin-5674174_960_720.png",625,500,80,50));
        tableDecorList.add(new BasicComponent("src/resource/pumpkin-5674174_960_720.png",645,515,80,50));
        tableDecorList.add(new BasicComponent("src/resource/pumpkin-5674174_960_720.png",610,520,80,50));
        tableDecorList.add(new BasicComponent("src/resource/skull-1746159_960_720.png",765,490,80,70));
        tableDecorList.add(new BasicComponent("src/resource/eyeball.png",840,535,15,13));
        tableDecorList.add(new BasicComponent("src/resource/eyeball.png",830,550,15,13));
        tableDecorList.add(new BasicComponent("src/resource/eyeball.png",850,545,15,13));


    }
    @Override
    public List<Component> getTableDecorList() {
        return tableDecorList;
    }
}
