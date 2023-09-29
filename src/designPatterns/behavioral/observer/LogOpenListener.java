package src.designPatterns.behavioral.observer;

public class LogOpenListener implements EventListener{
    @Override
    public void notify(String eventType, String file) {
        System.out.printf("LogOpenListener : %s performed on file %s %n",eventType,file);
    }
}
