import java.io.File;

public class RarCompressor implements CompressionStrategy {
    @Override
    public void compress(File file) {
        System.out.println("File is compressing by Rar strategy");
    }
}
