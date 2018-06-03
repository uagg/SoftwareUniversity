package Essentials;

import CustomExceptions.*;

public class Song {
    private String artistName;
    private String songName;
    private int min;
    private int sec;

    public Song(String inputArtistName, String inputSongName, int inputMinutes, int inputSeconds) throws InvalidSongException {
        this.setArtistName(inputArtistName);
        this.setSongName(inputSongName);
        this.setMinutes(inputMinutes);
        this.setSeconds(inputSeconds);
    }

    private void setArtistName(String inputArtistName) throws InvalidArtistNameException {
        if((inputArtistName.length() < 3) || (inputArtistName.length() > 20)) {
            throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");
        }

        this.artistName = inputArtistName;
    }

    private void setSongName(String inputSongName) throws InvalidSongNameException {
        if((inputSongName.length() < 3) || (inputSongName.length() > 30)) {
            throw new InvalidSongNameException("Song name should be between 3 and 30 symbols.");
        }

        this.songName = inputSongName;
    }

    private void setMinutes(int inputMinutes) throws InvalidSongLengthException {
        if(inputMinutes < 0 || inputMinutes > 14) {
            throw new InvalidSongMinutesException("Song minutes should be between 0 and 14.");
        }

        this.min = inputMinutes;
    }

    private void setSeconds(int inputSeconds) throws InvalidSongLengthException {
        if(inputSeconds < 0 || inputSeconds > 59) {
            throw new InvalidSongSecondsException("Song seconds should be between 0 and 59.");
        }

        this.sec = inputSeconds;
    }

    public int getMinutes() {
        return this.min;
    }

    public int getSeconds() {
        return this.sec;
    }
}
