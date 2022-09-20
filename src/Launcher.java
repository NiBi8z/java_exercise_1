import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
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