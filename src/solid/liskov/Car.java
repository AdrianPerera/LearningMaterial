package src.solid.liskov;

public class Car implements Vehicle{
    @Override
    public int getInteriorWidth() {
        return this.getCabinWidth();
    }

    private int getCabinWidth(){
        return 1;
    }
}
