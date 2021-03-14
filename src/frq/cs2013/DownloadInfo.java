package frq.cs2013;

public class DownloadInfo {
    private String title;
    private int downloads;

    public DownloadInfo (String title) {
        this.title = title;
        this.downloads = 0;
    }

    public String getTitle() {
        return title;
    }

    public void incrementTimesDownloaded() {
        downloads++;
    }
}
