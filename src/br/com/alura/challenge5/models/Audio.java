package br.com.alura.challenge5.models;

public class Audio {
    protected String title;
    protected int totalReproduction = 0;
    protected double duration;
    protected boolean like = false;
    protected double classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void reproduce(){
        totalReproduction++;
    }
    public void like(){
        like = true;
    }
    public void dislike(){
        like = false;
    }
    public void classify(double classification){
        this.classification = classification;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void displayRecords(){
        System.out.printf("""
                The title is: %s
                The duration is: %.0f seconds
                The total reproduction is: %s
                The classification is: %s
                The audio is liked: %s
                """, title, duration, totalReproduction, classification, like);
    }
}
