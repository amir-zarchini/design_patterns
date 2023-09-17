public class DraftStatus implements DocumentStatus {

    @Override
    public void next(Document document) {
        document.setStatus(new ConfirmedStatus());
    }

    @Override
    public void prev(Document document) {
        System.out.println("Invalid operation: Document is in draft mode");
    }

    @Override
    public void print() {
        System.out.println("Document status value is Draft");
    }
}
