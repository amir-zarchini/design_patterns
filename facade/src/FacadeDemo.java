import convert.*;

import java.io.File;

public class FacadeDemo {

    public static void main(String[] args) {

        VideoConverterFacade converter = new VideoConverterFacade();
        File mp4 = converter.convert(new VideoFile("youtubevideo.ogg"), "mp4");
        System.out.println();
        File ogg = converter.convert(new VideoFile("file2.mp4"), "ogg");
    }
}
