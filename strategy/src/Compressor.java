import java.io.File;

public class Compressor {

    private final CompressionStrategy compression;

    public Compressor(CompressionStrategy compression) {
        this.compression = compression;
    }

    public void compress(File file) {
        compression.compress(file);
    }
}
