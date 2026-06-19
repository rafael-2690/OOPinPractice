package br.com.alura.challenge1.music;

public class TestMusic {
    public static void main(String[] args) {
        Music music = new Music();

        music.setArtist("Bruno Mars");
        music.setTitle("Please Me");
        music.setYearRelease(2020);
        music.displayRecord();
        music.toAssess(10);
        music.toAssess(5);
        System.out.println(music.Average());
    }
}
