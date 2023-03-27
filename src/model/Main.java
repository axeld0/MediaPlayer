import model.MediaPlayer;
import model.Song;
import model.User;
import java.util.Scanner;

public class Main
{
    /*
    Escenario 1 : Biblioteca. VERBO: PRESTAMOS/DEVOLUCIÓN
    Sistema de alquiler de libros. Por un lado, tenemos al usuario. 3 socios y 3 libros.
    Usuario: Nombre y apellido, dni , teléfono, mail, tipo de socio, si tiene libros en su haber y la cantidad de libros
    disponibles.
    Libros: Código, disponibilidad, cantidad de préstamos que tiene el libro, Género, cantidad de alquileres.

    ESCENARIO 2 : REPRODUCTOR DE MÚSICA
    canción y usuario. VERBO : REPRODUCIR/DETENER
    Estado de reproducción de la canción : Reproduciendo o no. No se puede reproducir dos veces.

    ESCENARIO 3: SISTEMA DE VENTAS . VERBO : COMPRAR/FACTURAR
    tenemos productos, vendemos los mismos. Hacemos facturas.

     */
  static Scanner scan;
    public static void main(String[] args)
    {

        scan = new Scanner(System.in);
        signIn();  //signs in an user.
        setSongs();  //loads song list


        scan.close();
    }


    public static void signIn()
    {
        User user = new User();
        MediaPlayer newMP = new MediaPlayer(); //creates the media player object
        newMP.setOffOn(true);  //turns on the media player
        System.out.println("Welcome to Java MediaPlayer.\nPlease, sign in.\n Insert your name : ");
        String userName = scan.nextLine();
        System.out.println("\nExcelent! Now please insert your age :");
        int userAge = scan.nextInt();
        System.out.println("Great! One more question. What is your favourite genre?");
        String userFavouriteGenre = scan.nextLine();
        newMP.userRegistration(userName, userAge, userFavouriteGenre);  //imports a mediaPlayer.java method and sets the user's data

    }

    public static void setSongs()
    {
        System.out.println("Loading Songs...\n\n");
        Song thrillIsGone = new Song("The thrill is gone", "Completely well", 1969, "B.B. King", "blues");
        Song igorsTheme = new Song("IGOR'S THEME" , "IGOR" , 2020, "Tyler the Creator", "rap" );
        Song toxic = new Song("Toxic", "In the Zone" , 2003 , "Britney Spears", "pop");
        Song threeLittleBirds = new Song("Three Little Birds", "Exodus", 1977, "Bob Marley & The Wailers", "Reggae");
        Song virtualInsanity = new Song("Virtual Insanity", "Travelling Without Moving", 1966, "Jamiroquai", "Dance");
        Song paLaSeleccion = new Song("Pa' la Seleccion", "No album", 2023, "La T y la M", "Cumbia");
        Song aquelloQuePaso = new Song("Aquello Que Pasó", "No album", 2021, "Ke Personajes", "Cumbia");
        Song cryMeARiver = new Song("Cry Me a River", "Ella Fitzgerald", 1989, "Clap Hands, Here Comes Charlie", "Jazz");
        Song oneMoreTime = new Song("One More Time", "Discovery", 2001, "Daft Punk", "Dance");
        Song whatsMyAgeAgain = new Song("What's My Age Again?", "Enemy Of The State", 1999, "Blink 182", "Punk rock");
    }



}