package convert;

public class BitrateReader {

    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("convert.BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("convert.BitrateReader: converting file...");
        return buffer;
    }
}
