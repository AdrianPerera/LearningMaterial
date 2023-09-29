package src.designPatterns.behavioral.observer;

public class Editor {
    public EventManager events = new EventManager("open", "save");
    String file = "";

    void openFile(String fileName) {
        this.file = fileName;
        events.notify("open", file);
    }

    void saveFile() {
        if (!file.equals("")) {
            events.notify("save", file);
        }
    }
}
