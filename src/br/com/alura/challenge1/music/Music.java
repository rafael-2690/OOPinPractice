package br.com.alura.challenge1.music;

public class Music {
    private String title;
    private String artist;
    private int yearRelease;
    private double avaliable;
    private int numberAvaliable;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void displayRecord(){
        System.out.printf("""
                The title is: %s
                The artist is: %s
                The year release is: %d
                """,  title, artist, yearRelease);
    }
    public void toAssess(double avaliable){
        this.avaliable = avaliable;
        numberAvaliable ++;
    }

    public double Average(){
        return avaliable / numberAvaliable;
    }

}
