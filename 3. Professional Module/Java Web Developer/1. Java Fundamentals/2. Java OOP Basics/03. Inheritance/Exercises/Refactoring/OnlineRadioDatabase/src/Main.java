import CustomExceptions.*;
import Essentials.Song;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InvalidSongException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfSongs = Integer.parseInt(reader.readLine());
        List<Song> playlist = new ArrayList<>();

        while(numberOfSongs-- > 0) {
            String[] tokens = reader.readLine().split(";");

            // Extracred data from the tokens
            String artist = tokens[0];
            String song = tokens[1];
            String[] time = tokens[2].split(":");
            int minutes = Integer.parseInt(time[0]);
            int seconds = Integer.parseInt(time[1]);

            try {
                Song currentSong = new Song(artist, song, minutes, seconds);
                playlist.add(currentSong);
                System.out.println("Song added.");
            } catch (InvalidArtistNameException ane) {
                System.out.println(ane.getMessage());
            } catch (InvalidSongNameException sne) {
                System.out.println(sne.getMessage());
            } catch (InvalidSongMinutesException sme) {
                System.out.println(sme.getMessage());
            } catch (InvalidSongSecondsException sse) {
                System.out.println(sse.getMessage());
            }
        }

        System.out.println("Songs added: " + playlist.size());

        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        int sumOfHours = 0;
        int sumOfMinutes = 0;
        int sumOfSeconds = 0;

        for (Song song : playlist) {
            int currentSongMinutes = song.getMinutes();
            int currentSongSeconds = song.getSeconds();
            sumOfMinutes += currentSongMinutes;
            sumOfSeconds += currentSongSeconds;
        }

        int minutesFromSeconds = 1;

        if(sumOfSeconds > 59) {
            minutesFromSeconds = sumOfSeconds / 60;
            sumOfMinutes += minutesFromSeconds;
            if(!(sumOfSeconds == 60)) {
                sumOfSeconds = sumOfSeconds / (minutesFromSeconds * 60);
            } else {
                sumOfSeconds = 0;
            }

        }



        int hoursFromMinutes = 1;

        if(sumOfMinutes > 59) {
            hoursFromMinutes = sumOfMinutes / 60;
            sumOfHours += hoursFromMinutes;
            if(!(sumOfMinutes == 60)) {
                sumOfMinutes = sumOfMinutes / (hoursFromMinutes * 60);
            } else {
                sumOfMinutes = 0;
            }
        }



        System.out.printf("Playlist length: %dh %dm %ds", sumOfHours, sumOfMinutes, sumOfSeconds);
    }
}
