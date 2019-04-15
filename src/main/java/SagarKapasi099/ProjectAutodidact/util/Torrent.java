package SagarKapasi099.ProjectAutodidact.util;

/**
 * POJO To Hold .torrent file path and directory where the torrent will be downloaded
 */
public class Torrent {
    private String torrentPath;
    private String toDirectory;

    public Torrent(String torrentPath, String toDirectory) {
        this.torrentPath = torrentPath;
        this.toDirectory = toDirectory;
    }

    public String getTorrentPath() {
        return torrentPath;
    }

    public void setTorrentPath(String torrentPath) {
        this.torrentPath = torrentPath;
    }

    public String getToDirectory() {
        return toDirectory;
    }

    public void setToDirectory(String toDirectory) {
        this.toDirectory = toDirectory;
    }

    @Override
    public String toString() {
        return "Torrent - [" + this.torrentPath + "] : [" + this.toDirectory + "]";
    }
}
