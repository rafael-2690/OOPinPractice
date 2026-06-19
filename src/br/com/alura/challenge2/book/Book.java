package br.com.alura.challenge2.book;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void DisplayRecord(){
        System.out.printf("""
                The title is: %s
                The author is: %s
                """, title, author);
    }
}
