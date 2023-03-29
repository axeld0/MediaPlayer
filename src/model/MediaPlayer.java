package model;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;

public class MediaPlayer
{
    private boolean offOn;
    User user;

    ArrayList <Song> songArray;

    private boolean pausePlay;


    public MediaPlayer ()
    {
        offOn = false;
        user = new User()  ;
        pausePlay = false;
        ArrayList<Song> songArray = new ArrayList<Song>();
    }



    public MediaPlayer(boolean offOn, User user, ArrayList<Song> songArray, boolean pausePlay) {
        this.offOn = offOn;
        this.user = user;
        this.songArray = songArray;
        this.pausePlay = pausePlay;
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

