package SagarKapasi099.ProjectAutodidact.BitTorrentClient;

/**
 * POJO To Hold .torrent file path and directory where the torrent will be downloaded
 */
public class Torrent {
    // Name of the torrent and its directory
    private String displayName;

    private final String magnetLink;

    private String percentageCompleted;

    private final String dateAdded;

    public Torrent(String displayName, String magnetLink, String percentageCompleted, String dateAdded) {
        this.displayName = displayName;
        this.magnetLink = magnetLink;
        this.percentageCompleted = percentageCompleted;
        this.dateAdded = dateAdded;
    }

    String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getMagnetLink() {
        return magnetLink;
    }

    public String getPercentageCompleted() {
        return percentageCompleted;
    }

    public void setPercentageCompleted(String percentageCompleted) {
        this.percentageCompleted = percentageCompleted;
    }

    public String getDateAdded() {
        return dateAdded;
    }
}
