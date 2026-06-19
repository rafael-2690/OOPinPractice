package br.com.alura.challenge5.main;

import br.com.alura.challenge5.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Podcast audio = new Podcast();

        audio.setTitle("AABB");
        audio.setNumberOfEpisodes(10);
        audio.setDuration(180);
        audio.classify(10);
        audio.like();
        audio.reproduce();
        audio.reproduce();
        audio.displayRecords();
    }
}
