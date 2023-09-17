import java.io.File;

public class _7ZipCompressor implements CompressionStrategy {
    @Override
    public void compress(File file) {
        System.out.println("File is compressing by 7Zip strategy");
    }
}
