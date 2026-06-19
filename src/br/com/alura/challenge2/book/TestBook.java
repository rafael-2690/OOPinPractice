package br.com.alura.challenge2.book;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();

        book.setAuthor("Rick Jordan");
        book.setTitle("Percy Jackson");
        book.DisplayRecord();
    }
}
