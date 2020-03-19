package com.company;

/**
 * Provide represent a song with following field
 * @author Sayed Mohammad Ali Mirkazemi
 * @version 2020
 */
public class Song {
    // An String for song's name
    private String name;
    // An String for storing singer's name
    private String singer;
    // An String for storing year of produce song
    private String year;
    // An ArrayList for storing the file names of music files.
    private String address;

    /**
     * Constructor for fields of class Song
     */
    public Song(Song song){
        this.name=song.name;
        this.singer=song.singer;
        this.year=song.year;
        this.address=song.address;
    }

    /**
     * getter method for field name
     * @return name field
     */
    public String getName() {
        return name;
    }

    /**
     * getter method for field Singer
     * @return singer field
     */
    public String getSinger() {
        return singer;
    }

    /**
     * getter method for field year
     * @return year field
     */
    public String getYear() {
        return year;
    }

    /**
     * getter method for field address
     * @return address field
     */
    public String getAddress() {
        return address;
    }
}
