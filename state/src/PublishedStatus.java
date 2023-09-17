public class PublishedStatus implements DocumentStatus {

    @Override
    public void next(Document document) {
        document.setStatus(new DeprecatedStatus());
    }

    @Override
    public void prev(Document document) {
        document.setStatus(new ConfirmedStatus());
    }

    @Override
    public void print() {
        System.out.println("Document status value is Published");
    }
}
