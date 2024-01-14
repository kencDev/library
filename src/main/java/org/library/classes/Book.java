package org.library.classes;

public class Book {
    String bookName;
    String authorName;
    String publisherName;
    String pages;
    String coverType;
    String isbn;
    Enum<Genre> genre;

    public String getBookname() {
        return bookName;
    }

    public void setBookname(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Enum<Genre> getGenre() {
        return genre;
    }

    public void setGenre(Enum<Genre> genre) {
        this.genre = genre;
    }


}
