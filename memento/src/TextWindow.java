public class TextWindow {

    private StringBuilder text;

    public TextWindow() {
        text = new StringBuilder();
    }

    public void addText(String text) {
        this.text.append(text);
    }

    public void print() {
        System.out.println(text.toString());
    }

    public TextWindowStatus saveStatus() {
        return new TextWindowStatus(text.toString());
    }

    public void restoreStatus(TextWindowStatus status) {
        text = new StringBuilder(status.getText());
    }
}
