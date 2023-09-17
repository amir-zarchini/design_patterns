public class Document {

    private DocumentStatus status;

    public Document() {
        status = new DraftStatus();
    }

    public void setStatus(DocumentStatus status) {
        this.status = status;
    }

    public void nextStatus() {
        status.next(this);
    }

    public void prevStatus() {
        status.prev(this);
    }

    public void printStatus() {
        status.print();
    }
}
