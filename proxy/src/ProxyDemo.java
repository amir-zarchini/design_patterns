import impl.ThirdPartyYoutubeClass;

public class ProxyDemo {

    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYoutubeClass());
        YouTubeDownloader cacheDownloader = new YouTubeDownloader(new YouTubeDownloaderProxy());

        long naive = test(naiveDownloader);
        long smart = test(cacheDownloader);

        printDifference(naive, smart);
    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }

    private static void printDifference(long naive, long smart) {
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
    }
}
