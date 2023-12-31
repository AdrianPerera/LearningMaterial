package src.designPatterns.behavioral.observer;

public interface EventListener {
    void notify(String eventType, String file);
}
