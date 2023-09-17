public class UndoCommand extends Command {

    public UndoCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if(!editor.history.isEmpty()) {
            Command command = editor.history.pop();
            if(command != null) {
                command.undo();
            }
        }
        return false;
    }
}
