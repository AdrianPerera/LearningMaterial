package src.designPatterns.structural.adpater;

public class DisplayData3rdParty {
    public float  index;
    public String data;

    public DisplayData3rdParty(float index, String data) {
        this.index = index;
        this.data = data;
    }

    public void displayData(){
        System.out.printf("Data is displayed : %f - %s%n",index,data);
    }
}
