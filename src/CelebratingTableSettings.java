import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CelebratingTableSettings implements TableSettings {
    private List<Component> tableDecorList = new ArrayList<>();
    public CelebratingTableSettings() throws IOException {
        tableDecorList.add(new BasicComponent("src/resource/cat-toy.png",310,495,70,50));
        tableDecorList.add(new BasicComponent("src/resource/candles.png",565,495,20,50));
        tableDecorList.add(new BasicComponent("src/resource/candles.png",595,490,20,50));
        tableDecorList.add(new BasicComponent("src/resource/candle-red-with-stand.png",575,500,30,60));
        tableDecorList.add(new BasicComponent("src/resource/vase-whiteflowers.png",700,480,70,70));
        tableDecorList.add(new BasicComponent("src/resource/pumpkin-157050_960_720.png",625,500,70,65));
        tableDecorList.add(new BasicComponent("src/resource/bowl-with-candies.png",790,510,60,40));
        tableDecorList.add(new BasicComponent("src/resource/candy-146194_960_720.png",810,550,20,10));
        tableDecorList.add(new BasicComponent("src/resource/candy-297538_960_720.png",810,555,10,10));
        tableDecorList.add(new BasicComponent("src/resource/candy-575432_960_720.png",828,550,20,10));



    }
    @Override
    public List<Component> getTableDecorList() {
        return tableDecorList;
    }
}
