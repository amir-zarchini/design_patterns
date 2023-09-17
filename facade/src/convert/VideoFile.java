package convert;

public class VideoFile {

    private String name;
    private String codecType;

    public VideoFile(String fileName) {
        this.name = fileName;
        this.codecType = fileName.substring(fileName.indexOf(".") + 1);
    }

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }
}
