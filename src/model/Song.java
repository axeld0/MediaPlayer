package model;

public class Song {

    private String title;
    private String album;
    private int releaseDate;
    private String author;
    private String genre;


    public Song()
    {
        title = "";
        album = "";
        releaseDate = 0;
        author = "";
        genre= "";

    }

    public Song (String title, String album , int releaseDate , String author , String genre)
    {
        this.title = title;
        this.album = album;
        this.author = author;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }
//getters
    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
//setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
