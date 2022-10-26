import java.util.Scanner;

public class cycle {
    public static void main(String[] args) {
        int zagadannoe = 14 ;
        Scanner scanner = new Scanner(System.in) ;
        int input = 432;
        int popitki = 5;
        while (true){
            System.out.println("WHRITE YOUR NUM");
            input = scanner.nextInt() ;
            if (zagadannoe == input){
                System.out.println(" You win");
                break;
            }
            popitki--;
            if (popitki < 1)
            {
                System.out.println("You lose");
                break;
            }
        }



    }
}
