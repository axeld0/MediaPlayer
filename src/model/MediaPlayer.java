package model;

public class MediaPlayer {
    private boolean offOn;

    Song [] songArray;

    private boolean pausePlay;


    public MediaPlayer() {
        offOn = false;
        pausePlay = false;
        songArray = new Song[10];

    }

    public MediaPlayer(boolean offOn, User user, Song[] songArray, boolean pausePlay) {
        this.offOn = offOn;

        this.songArray = songArray;
        this.pausePlay = pausePlay;
    }

    public void setOffOn(boolean offOn) {
        this.offOn = offOn;
    }


    public boolean isPausePlay() {
        return pausePlay;
    }

    public void setPausePlay(boolean pausePlay) {
        this.pausePlay = pausePlay;
    }

    public User userRegistration(String userName, int age, String genre) {
        User newUser = new User();
        newUser.setName(userName);
        newUser.setAge(age);
        newUser.setFavouriteGenre(genre);
        newUser.setSongsPlayed(0);
        newUser.setListenedTime(0);

        return newUser;

    }

    public  void setSongs() {
        int arraySize = songArray.length;
        System.out.println("Loading Songs...\n\n");
        Song thrillIsGone = new Song("The thrill is gone", "Completely well", 1969, "B.B. King", "blues");
        Song igorsTheme = new Song("IGOR'S THEME", "IGOR", 2020, "Tyler the Creator", "rap");
        Song toxic = new Song("Toxic", "In the Zone", 2003, "Britney Spears", "pop");
        Song threeLittleBirds = new Song("Three Little Birds", "Exodus", 1977, "Bob Marley & The Wailers", "Reggae");
        Song virtualInsanity = new Song("Virtual Insanity", "Travelling Without Moving", 1966, "Jamiroquai", "Dance");
        Song paLaSeleccion = new Song("Pa' la Seleccion", "No album", 2023, "La T y la M", "Cumbia");
        Song aquelloQuePaso = new Song("Aquello Que Pasó", "No album", 2021, "Ke Personajes", "Cumbia");
        Song cryMeARiver = new Song("Cry Me a River", "Ella Fitzgerald", 1989, "Clap Hands, Here Comes Charlie", "Jazz");
        Song oneMoreTime = new Song("One More Time", "Discovery", 2001, "Daft Punk", "Dance");
        Song whatsMyAgeAgain = new Song("What's My Age Again?", "Enemy Of The State", 1999, "Blink 182", "Punk rock");

        this.songArray[0] = thrillIsGone;
        this.songArray[1] = igorsTheme;
        this.songArray[2] = toxic;
        this.songArray[3] = threeLittleBirds;
        this.songArray[4] = virtualInsanity;
        this.songArray[5] = paLaSeleccion;
        this.songArray[6] = aquelloQuePaso;
        this.songArray[7] = cryMeARiver;
        this.songArray[8] = oneMoreTime;
        this.songArray[9] = whatsMyAgeAgain;  //added the songs to the array

        System.out.println("Songs successfully loaded!");


    }

    public void showSongList (User newUser)
    {
        System.out.println(newUser.getName()+", What song do you want to play?\n");
        int arraySize = this.songArray.length;
        for(int i = 0 ; i < arraySize ; i++)
        {
            System.out.println("--" + (i+1) + ")"+ this.songArray[i].getTitle());  // prints the list of avalaible songs.
        }

    }

    public void playSong(int selectedSong)
    {
        System.out.println("Great, you've selected:  "+songArray[selectedSong-1].getTitle()+" ! Enjoy your song :).");
    }
}