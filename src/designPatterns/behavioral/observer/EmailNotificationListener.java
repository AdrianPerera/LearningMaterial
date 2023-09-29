package src.designPatterns.behavioral.observer;

public class EmailNotificationListener implements EventListener{

    @Override
    public void notify(String eventType, String file) {
        System.out.printf("EmailNotificationListener : %s performed on file %s %n",eventType,file);
    }
}
