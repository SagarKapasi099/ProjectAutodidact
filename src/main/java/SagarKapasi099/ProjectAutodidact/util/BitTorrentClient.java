package SagarKapasi099.ProjectAutodidact.util;

import com.turn.ttorrent.client.Client;
import com.turn.ttorrent.client.SharedTorrent;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 * This Class manages an ArrayList of {@link com.turn.ttorrent.client.Client}
 */

public class BitTorrentClient {

    /**
     * holds all the torrent clients
     */
    private static ArrayList<Client> clients = new ArrayList<>();

    /**
     * @return all the torrent clients added
     */
    public ArrayList<Client> getClients() {
        return clients;
    }

    /**
     * @param torrents Torrent Objects to be added to {@link SagarKapasi099.ProjectAutodidact.util.BitTorrentClient#clients}
     * @return All the torrent clients added so far
     * @see Torrent
     */
    public ArrayList<Client> addClients(ArrayList<Torrent> torrents) {
        // Make The List
        for (Torrent torrent : torrents) {
            // add client if not null
            Client currentClient = createClientFromTorrent(torrent);
            if (currentClient != null) {
                clients.add(currentClient);
            }
        }
        return clients;
    }

    /**
     * Constructs <b>Client</b> Object From .torrent file path and directory in which to save the torrent
     *
     * @param torrent Object that contains .torrent file path and directory in which to save the torrent
     * @return <b>Client</b> Object
     */
    private static Client createClientFromTorrent(Torrent torrent) {
        try {
            return new Client(
                    InetAddress.getLocalHost(),
                    SharedTorrent.fromFile(
                            new File(torrent.getTorrentPath()),
                            new File(torrent.getToDirectory())));
        } catch (IOException | NoSuchAlgorithmException e) {
            e.getMessage();
            System.err.println(torrent);
        }
        return null;
    }
}
