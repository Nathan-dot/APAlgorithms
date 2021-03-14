package frq.cs2013;

import java.util.ArrayList;

public class TestClient {
    public static void main(String[] args) {
        DownloadInfo songs = new DownloadInfo("Hey Jude");
        ArrayList<String> titles = new ArrayList<String>();
        titles.add("Hey Jude");
        titles.add("Soul Sister");
        titles.add("Aqualung");
        System.out.println(songs.getTitle());
        songs.incrementTimesDownloaded();



    }
}
