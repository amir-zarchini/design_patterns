import abs.ThirdPartyYouTubeLib;
import impl.ThirdPartyYoutubeClass;
import model.Video;

import java.util.HashMap;

public class YouTubeDownloaderProxy implements ThirdPartyYouTubeLib {

    private ThirdPartyYoutubeClass youTubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeDownloaderProxy() {
        youTubeService = new ThirdPartyYoutubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if(cachePopular.isEmpty()) {
            cachePopular = youTubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if(video == null) {
            video = youTubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache");
        }
        return video;
    }

    public void reset() {
        cacheAll = new HashMap<>();
        cachePopular = new HashMap<>();
    }
}
