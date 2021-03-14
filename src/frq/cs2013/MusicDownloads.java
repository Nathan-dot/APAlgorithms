package frq.cs2013;
import java.util.List;
import java.util.ArrayList;
public class MusicDownloads {
    private List<DownloadInfo> downloadList;

    public MusicDownloads() {
        downloadList = new ArrayList<DownloadInfo> ();
    }

    public DownloadInfo getDownloadInfo(String title) {
        for(DownloadInfo info : downloadList) {
            if(title.equals(info.getTitle())) {
                return info;
            }
        }
        return null;
    }

    public void updateDownloads(List<String> titles) {
        for(String title : titles) {
            DownloadInfo info = getDownloadInfo(title);
            if(info != null) {
                info.incrementTimesDownloaded();
            }
            else {
                downloadList.add(new DownloadInfo(title));
            }
        }
    }
}
