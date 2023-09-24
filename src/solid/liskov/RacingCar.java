package src.solid.liskov;

public class RacingCar implements Vehicle{
    @Override
    public int getInteriorWidth() {
        return this.getCockpitWidth();
    }

    private int getCockpitWidth() {
        return 2;
    }
}
