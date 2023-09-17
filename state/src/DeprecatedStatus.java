public class DeprecatedStatus implements DocumentStatus {

    @Override
    public void next(Document document) {
        System.out.println("Invalid operation: Document is deprecated now");
    }

    @Override
    public void prev(Document document) {
        document.setStatus(new PublishedStatus());
    }

    @Override
    public void print() {
        System.out.println("Document status value is Deprecated");
    }
}
