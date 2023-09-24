package src.designPatterns.structural.adpater;

import java.util.List;

public interface DatabaseDataConverter {
    public List<DisplayData3rdParty> convertData(List<DatabaseData> data);

}
