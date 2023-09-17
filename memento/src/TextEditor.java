import java.util.ArrayList;
import java.util.List;

public class TextEditor {

    private TextWindow textWindow;
    private List<TextWindowStatus> checkpoints = new ArrayList<>();

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public void show() {
        textWindow.print();
    }

    public void save() {
        TextWindowStatus status = textWindow.saveStatus();
        checkpoints.add(status);
    }

    public void restore(int i) {
        textWindow.restoreStatus(checkpoints.get(i));
    }
}
