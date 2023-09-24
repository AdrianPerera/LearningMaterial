package src.designPatterns.structural.bridge;

import src.designPatterns.structural.bridge.interfaces.App;
import src.designPatterns.structural.bridge.interfaces.PhoneOS;

public class Instagram implements App {

    PhoneOS os;

    public Instagram(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void runApp() {
        os.display("cached data");
        os.upload("instagram.com");
        os.display("instagram data");
        os.display("fresh data");
        System.out.println();
    }
}
