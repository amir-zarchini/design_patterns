public class Demo {

    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor(new TextWindow());

        textEditor.write("Hello\n");
        textEditor.write("My name is Saman\n");

        textEditor.show();
        textEditor.save();

        textEditor.write("This video is about Memento pattern\n");
        textEditor.show();

        System.out.println("----------------------");

        textEditor.restore(0);
        textEditor.show();
    }
}
