package src.designPatterns.structural.bridge;

import src.designPatterns.structural.bridge.interfaces.PhoneOS;

public class IOS implements PhoneOS {
    @Override
    public void upload(String data) {
        System.out.printf("Iphone uploading data : %s %n", data);

    }

    @Override
    public void download(String url) {
        System.out.printf("Iphone downloading from : %s %n", url);
    }

    @Override
    public void display(String data) {
        System.out.printf("Iphone displaying data : %s %n", data);
    }
}
