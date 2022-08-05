package s8.ce46;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title))
                return song;
        }
        return null;
    }

    public boolean addToPlayList(int track, LinkedList<Song> playList) {
        // argument track follows natural counting
        // not whole counting
        // that is, if track = 1 means 0 in ArrayList<Song>
        try {
            Song songToAdd = songs.get(track - 1);
            return playList.offer(songToAdd);
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        // for this album instance
        // check if title exists in ArrayList of Song
        // Then add it to playList
        Song songToAdd = findSong(title);
        if (songToAdd != null) {
            return playList.offer(songToAdd);
        }
        return false;
    }
}