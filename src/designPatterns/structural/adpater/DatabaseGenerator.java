package src.designPatterns.structural.adpater;

import java.util.ArrayList;
import java.util.List;

public class DatabaseGenerator {
    public List<DatabaseData> generateData() {
        List<DatabaseData>  list = new ArrayList<>();
        list.add(new DatabaseData(2,3));
        list.add(new DatabaseData(3,7));
        list.add(new DatabaseData(4,23));
        return list;
    }
}
