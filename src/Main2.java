import model.MediaPlayer;
import model.User;

import java.util.Scanner;

public class Main2
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


        System.out.println("WELCOME TO JAVA MEDIA PLAYER V1.\nPlease, press enter to start!.");
       scan.next();
       scan.next();




        MediaPlayer newMP = new MediaPlayer();
        User newUser;

        newUser = signIn(newMP);  //signs in an user.
        newMP.setSongs();//loads song list. a method from media player object

        newMP.showSongList(newUser);
        int selectedSong = scan.nextInt();
        newMP.playSong(selectedSong);


        scan.close();
    }

    public static User signIn(MediaPlayer newMP)
    {
        //creates the media player object
        //turns on the media player
        newMP.setOffOn(true);   //turns on the media player.
        System.out.println("Welcome to Java MediaPlayer.\nPlease, sign in.\n Insert your name : ");
        String userName = scan.nextLine();
        System.out.println("\nExcelent! Now please insert your age :");
        int userAge = scan.nextInt();
        System.out.println("Great! One more question. What is your favourite genre?");
        String userFavouriteGenre = scan.next();
        newMP.userRegistration(userName, userAge, userFavouriteGenre);  //imports a mediaPlayer.java method and sets the user's data
        System.out.println("Welcome " + userName +" of " +userAge+" years old, enyojer of "+userFavouriteGenre+" music!");

        return newMP.userRegistration(userName,userAge, userFavouriteGenre);
    }





}