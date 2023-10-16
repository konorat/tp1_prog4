package model;

import java.util.Comparator;
import java.util.function.Function;

public class MusicInfo {
    private String trackName;
    private String artistName;
    private String artistCount;
    private String releasedYear;
    private String releasedMonth;
    private String releasedDay;
    private String inSpotifyPlaylists;
    private String inSpotifyCharts;
    private String streams;
    private String inApplePlaylists;
    private String inAppleCharts;
    private String inDeezerPlaylists;
    private String inDeezerCharts;
    private String inShazamCharts;
    private String bpm;
    private String key;
    private String mode;
    private String danceability;
    private String valence;
    private String energy;
    private String acousticness;
    private String instrumentalness;
    private String liveness;
    private String speechiness;

    public MusicInfo(String trackName, String artistName, String artistCount, String releasedYear, String releasedMonth, String releasedDay, String inSpotifyPlaylists, String inSpotifyCharts, String streams, String inApplePlaylists, String inAppleCharts, String inDeezerPlaylists, String inDeezerCharts, String inShazamCharts, String bpm, String key, String mode, String danceability, String valence, String energy, String acousticness, String instrumentalness, String liveness, String speechiness) {
        this.trackName = trackName;
        this.artistName = artistName;
        this.artistCount = artistCount;
        this.releasedYear = releasedYear;
        this.releasedMonth = releasedMonth;
        this.releasedDay = releasedDay;
        this.inSpotifyPlaylists = inSpotifyPlaylists;
        this.inSpotifyCharts = inSpotifyCharts;
        this.streams = streams;
        this.inApplePlaylists = inApplePlaylists;
        this.inAppleCharts = inAppleCharts;
        this.inDeezerPlaylists = inDeezerPlaylists;
        this.inDeezerCharts = inDeezerCharts;
        this.inShazamCharts = inShazamCharts;
        this.bpm = bpm;
        this.key = key;
        this.mode = mode;
        this.danceability = danceability;
        this.valence = valence;
        this.energy = energy;
        this.acousticness = acousticness;
        this.instrumentalness = instrumentalness;
        this.liveness = liveness;
        this.speechiness = speechiness;
    }

    @Override
    public String toString() {
        return "MusicInfo{" +
                "trackName='" + trackName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", artistCount='" + artistCount + '\'' +
                ", releasedYear='" + releasedYear + '\'' +
                ", releasedMonth='" + releasedMonth + '\'' +
                ", releasedDay='" + releasedDay + '\'' +
                ", inSpotifyPlaylists='" + inSpotifyPlaylists + '\'' +
                ", inSpotifyCharts='" + inSpotifyCharts + '\'' +
                ", streams='" + streams + '\'' +
                ", inApplePlaylists='" + inApplePlaylists + '\'' +
                ", inAppleCharts='" + inAppleCharts + '\'' +
                ", inDeezerPlaylists='" + inDeezerPlaylists + '\'' +
                ", inDeezerCharts='" + inDeezerCharts + '\'' +
                ", inShazamCharts='" + inShazamCharts + '\'' +
                ", bpm='" + bpm + '\'' +
                ", key='" + key + '\'' +
                ", mode='" + mode + '\'' +
                ", danceability='" + danceability + '\'' +
                ", valence='" + valence + '\'' +
                ", energy='" + energy + '\'' +
                ", acousticness='" + acousticness + '\'' +
                ", instrumentalness='" + instrumentalness + '\'' +
                ", liveness='" + liveness + '\'' +
                ", speechiness='" + speechiness + '\'' +
                '}';
    }

    public String getTrackName() {
        return trackName;
    }

    public String getArtistName() {
        return artistName;
    }

}
