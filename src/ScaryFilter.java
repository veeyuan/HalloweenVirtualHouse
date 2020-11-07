import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScaryFilter implements Filter {
    private List<Component> filterList = new ArrayList<>();
    public ScaryFilter() throws IOException {
        filterList.add(new BasicComponent("src/resource/dust.png",390,150,600,600));
        filterList.add(new BasicComponent("src/resource/filter.png",0,0,1400,800));
    }
    @Override
    public List<Component> getFilterList() {
        return filterList;
    }
}
