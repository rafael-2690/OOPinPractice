package br.com.alura.challenge5.models;

public class Podcast extends Audio {
    protected int numberOfEpisodes;
    protected double timePerEpisode;
    protected double totalTime;

    @Override
    public double getDuration() {
        return totalTime;
    }

    @Override
    public void setDuration(double duration) {
        this.timePerEpisode = duration;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    @Override
    public void displayRecords(){
        totalTime = numberOfEpisodes * timePerEpisode;

        System.out.printf("""
                The title is: %s
                The duration is: %.0f seconds
                The total reproduction is: %s
                The classification is: %s
                The audio is liked: %s
                """, title, totalTime, totalReproduction, classification, like);
    }

}
