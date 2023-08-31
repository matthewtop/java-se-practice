package pl.globallogic.exercises.intermediate;
//Create a program that implements a playlist of songs.
//        To start you off, implement the following classes:
//        1. Album
//        - It has three fields, two Strings called name and artist, and an ArrayList that
//        holds objects of type Song called songs.
//        - A constructor that accepts two Strings (name of the album and artist). It initialises
//        the fields and instantiates songs.
//        - And three methods, they are:
//        - addSong(), has two parameters of type String (title of song), double (duration
//        of song) and returns a boolean. Returns true if the song was added successfully or
//        false otherwise.
//        - findSong(), has one parameter of type String (title of song) and returns a
//        Song. Returns the Song if it exists, null if it doesn't exists.
//        - addToPlayList(), has two parameters of type int (track number of song in
//        album) and LinkedList (the playlist) that holds objects of type Song, and returns a
//        boolean. Returns true if it exists and it was added successfully using the track
//        number, or false otherwise.
//        - addToPlayList(), has two parameters of type String (title of song) and
//        LinkedList (the playlist) that holds objects of type Song, and returns a boolean.
//        Returns true if it exists and it was added successfully using the name of the song, or
//        false otherwise.
//        2. Song
//        - It has two fields, a String called title and a double called duration.
//        - A constructor that accepts a String (title of the song) and a double (duration of
//        the song). It initialises title and duration.
//        - And two methods, they are:
//        - getTitle(), getter for title.
//        - toString(), Songs overriding toString method. Returns a String in the following
//        format: "title: duration"

import java.util.ArrayList;
import java.util.LinkedList;

public class ex45Playlist {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        Album album = new Album("Stormbringer", "Deep Purple");
        System.out.println(album.addSong("Stormbringer", 4.6));
        System.out.println(album.addSong("Love don't mean a thing", 4.22));
        System.out.println(album.addSong("Holy man", 4.3));
        System.out.println(album.addSong("Hold on", 5.6));
        System.out.println(album.addSong("Lady double dealer", 3.21));
        System.out.println(album.addSong("You can't do it right", 6.23));
        System.out.println(album.addSong("High ball shooter", 4.27));
        System.out.println(album.addSong("The gypsy", 4.2));
        System.out.println(album.addSong("Soldier of fortune", 3.13));
        System.out.println(albums.add(album));
        album = new Album("For those about to rock", "AC/DC");
        System.out.println( album.addSong("For those about to rock", 5.44));
        System.out.println(album.addSong("I put the finger on you", 3.25));
        System.out.println(album.addSong("Lets go", 3.45));
        System.out.println(album.addSong("Inject the venom", 3.33));
        System.out.println(album.addSong("Snowballed", 4.51));
        System.out.println(album.addSong("Evil walks", 3.45));
        System.out.println(album.addSong("C.O.D.", 5.25));
        System.out.println(album.addSong("Breaking the rules", 5.32));
        System.out.println(album.addSong("Night of the long knives", 5.12));
        albums.add(album);
        LinkedList<Song> playList = new LinkedList<Song>();

        System.out.println(albums.get(0).addToPlayList(9, playList));
        System.out.println(albums.get(1).addToPlayList(3, playList));
        System.out.println(albums.get(1).addToPlayList(2, playList));
        System.out.println(albums.get(1).addToPlayList(24, playList));
    }
}


class Song{
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title=title;
        this.duration=duration;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        return title+": "+duration;
    }
}

class Album{
    private String name,artist;
    private ArrayList<Song> songs;
    
    Album(String name, String artist){
        this.name=name;
        this.artist=artist;
        this.songs= new ArrayList<Song>();
    }
    
    public boolean addSong(String title, double duration){
        Song newSong = new Song(title,duration);
        if (findSong(title)==null){
            songs.add(newSong);
            return true;
        }
        else {
            return false;
        }
    }

    private Song findSong(String title){
        for(Song song : songs){
            if (song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        if(trackNumber >=-1 && trackNumber <= songs.size()){
            Song song = songs.get(trackNumber-1);
            playlist.add(song);
            return true;
        }
        else {
            return false;
        }
    }
}




