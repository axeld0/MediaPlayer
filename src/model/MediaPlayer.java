package model;

import javax.print.attribute.standard.Media;

public class MediaPlayer
{
    private boolean offOn;
    User user;

    Song songs;

    private boolean pausePlay;


    public MediaPlayer ()
    {
        offOn = false;
        user = new User()  ;
        pausePlay = false;
        songs = new Song();

    }

    public Song getSongs() {
        return songs;
    }

    public void setSongs(Song songs) {
        this.songs = songs;
    }

    public MediaPlayer(boolean offOn, User user, boolean pausePlay , Song songs) {
        this.offOn = offOn;
        this.user = user;
        this.pausePlay = pausePlay;
        this.songs = songs;
    }

    public boolean isOffOn() {
        return offOn;
    }

    public void setOffOn(boolean offOn) {
        this.offOn = offOn;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isPausePlay() {
        return pausePlay;
    }

    public void setPausePlay(boolean pausePlay) {
        this.pausePlay = pausePlay;
    }

    public void userRegistration(String userName, int age, String genre)
    {
        user.setName(userName);
        user.setAge(age);
        user.setFavouriteGenre(genre);
        user.setSongsPlayed(0);
        user.setListenedTime(0);
    }
}

