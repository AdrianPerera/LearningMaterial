package src.designPatterns.structural.bridge;

import src.designPatterns.structural.bridge.interfaces.App;
import src.designPatterns.structural.bridge.interfaces.PhoneOS;

public class Facebook implements App {
    private PhoneOS os;

    public Facebook(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void runApp() {
        os.upload("Facebook data upload");
        os.download("facebook.com");
        os.display("Facebook data");
        System.out.println();
    }
}
