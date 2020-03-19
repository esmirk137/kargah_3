package com.company;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicCollection {
    // A song
    private ArrayList<Song> songs;
    // A player for the music files.
    private MusicPlayer player;


    /**
     * Create a MusicCollection
     */
    public MusicCollection(MusicPlayer musicPlayer){
        songs= new ArrayList<Song>();
        player=musicPlayer;

    }

    /**
     * Add a song to the collection.
     * @param song The song to be added.
     */
    public void addSong(Song song){
        songs.add(song);
    }

    /**
     * Return the number of songs in the collection.
     * @return The number of songs in the collection.
     */
    public int getNumberOfSongs(){
        return songs.size();
    }

    /**
     * List a song from the collection.
     * @param index The index of the song to be listed.
     */
    public void listSong(int index){
        if(validIndex(index))
            System.out.println("Name: " + songs.get(index).getName() + "\nSinger: " + songs.get(index).getSinger() +
                    "\nYear: " + songs.get(index).getYear() + "\nAddress: " + songs.get(index).getAddress());
    }

    /**
     * Show a list of all the songs in the collection.
     */
    public void listAllFiles(){
        for(int i=0; i<songs.size(); i++)
            System.out.println("["+ i+1 +"] Name: "+ songs.get(i).getName() + "\n    Singer: "+ songs.get(i).getSinger()
                    + "\n    Year: " + songs.get(i).getYear() + "\n    Address: " + songs.get(i).getAddress());
    }

    /**
     * Remove a song from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeSong(int index){
        if(validIndex(index))
            songs.remove(index);
    }

    /**
     * Start playing a song in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the song to be played.
     */
    public void startPlaying(int index){
        if(validIndex(index))
            player.startPlaying(songs.get(index).getAddress());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying(){
        player.stop();
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index){
        if(index>=0 && index<songs.size())
            return true;
        System.out.println("Invalid index.");
        return false;
    }

    /**
     * This method search list and find the song if don't find print appropriate massage.
     * @param nameSong is the name of song that you wanna search and find it.
     */
    public void search (String nameSong){
        for(Song song: songs)
            if(song.getName().equals(nameSong)){
                System.out.println("It's address: " + song.getAddress());
                return;
            }
        System.out.println("There is no song with this name in the list.");
    }
}