package src.designPatterns.structural.bridge;

import src.designPatterns.structural.bridge.interfaces.PhoneOS;

public class Android implements PhoneOS {
    @Override
    public void upload(String data) {
        System.out.printf("Android uploading data : %s %n", data);
    }

    @Override
    public void download(String url) {
        System.out.printf("Android downloading from : %s %n", url);
    }

    @Override
    public void display(String data) {
        System.out.printf("Android displaying data : %s %n", data);
    }
}
