package model;

public class User
{
    private String name;
    private int age;
    private String favouriteGenre;
    private int songsPlayed;
    private float listenedTime;


    public User ()
    {
        name = "";
        age = 0;
        favouriteGenre = "";
        songsPlayed = 0;
        listenedTime = 0;
    }


    public User(String name, int age, String favouriteGenre, int songsPlayed, float listentingTime) {
        this.name = name;
        this.age = age;
        this.favouriteGenre = favouriteGenre;
        this.songsPlayed = songsPlayed;
        this.listenedTime = listenedTime;
    }

    //getters y setters
  //getters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavouriteGenre() {
        return favouriteGenre;
    }

//setters

    public void setFavouriteGenre(String favouriteGenre) {
        this.favouriteGenre = favouriteGenre;
    }

    public int getSongsPlayed() {
        return songsPlayed;
    }

    public void setSongsPlayed(int songsPlayed) {
        this.songsPlayed = songsPlayed;
    }

    public float getListenedTime() {
        return listenedTime;
    }

    public void setListenedTime(float listenedTime) {
        this.listenedTime = listenedTime;
    }
}
