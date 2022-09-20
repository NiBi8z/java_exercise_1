import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Launcher {
    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenue sur le launcher");

        while(true) {
        System.out.println("Veuillez saisir quelque chose");
        Scanner reader = new Scanner(System.in);
        String txt = reader.nextLine(); 
            if(txt.equals("quit")){
                return;
            }else if(txt.equals("fibo")){
                System.out.println("Veuillez choisir n");
                Scanner n_int = new Scanner(System.in);
                int n =  Integer.parseInt(n_int.nextLine());
                int res = start_fibo(n);
                System.out.println(res);

            }else if(txt.equals("freq")){
                System.out.println("Veuillez choisir le fichier");
                Scanner file = new Scanner(System.in);
                String fileName = file.nextLine();
                Count_words cw = new Count_words();
                int res =cw.start_freq(fileName);
               // System.out.println(res);

            }else {
                System.out.println("Unknown command");
            }
        }
        }
        public static int start_fibo(int n) {
            if (n == 0)
                return 0;
            else if (n == 1)
                return 1;
            else
                return start_fibo(n - 1) + start_fibo(n - 2);
        }
        }

