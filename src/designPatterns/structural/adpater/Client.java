package src.designPatterns.structural.adpater;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        DatabaseGenerator gen = new DatabaseGenerator();
        DisplayDataAdapter adapter = new DisplayDataAdapter();

        List<DisplayData3rdParty> legacyData = adapter.convertData(gen.generateData());

        for (DisplayData3rdParty datum : legacyData){
            datum.displayData();
        }

    }
}
