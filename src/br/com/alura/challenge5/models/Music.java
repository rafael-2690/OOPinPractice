package br.com.alura.challenge5.models;

public class Music extends Audio {
    private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String author) {
        this.artist = author;
    }

    @Override
    public void displayRecords(){
        System.out.printf("""
                The title is: %s
                The artist is: %s
                The duration is: %.0f seconds
                The total reproduction is: %s
                The classification is: %s
                The audio is liked: %s
                """, title, artist, duration, totalReproduction, classification, like);
    }
}
