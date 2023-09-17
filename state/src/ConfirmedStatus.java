public class ConfirmedStatus implements DocumentStatus {

    @Override
    public void next(Document document) {
        document.setStatus(new PublishedStatus());
    }

    @Override
    public void prev(Document document) {
        document.setStatus(new DraftStatus());
    }

    @Override
    public void print() {
        System.out.println("Document status value is Confirmed");
    }
}
