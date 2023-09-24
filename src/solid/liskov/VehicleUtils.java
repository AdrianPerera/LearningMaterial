package src.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class VehicleUtils {
    public static void main(String[] args) {
        Vehicle first = new Car();
        Vehicle sec = new Car();
        Vehicle third = new RacingCar();

        List<Vehicle> myV = new ArrayList<>();
        myV.add(first);
        myV.add(sec);
        myV.add(third);

        for (Vehicle v : myV){
            System.out.println(v.getInteriorWidth());
        }
    }
}
