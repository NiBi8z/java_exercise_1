import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue sur le launcher");


        System.out.println("Veuillez saisir quelque chose");
        Scanner reader = new Scanner(System.in);
        String txt = reader.nextLine(); 

        if(txt.equals("quit")) {
            return;
        } else {
            System.out.println("Unknown command");
        }
        reader.close();

    }
}