import java.util.Scanner;


public class Guessgame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int randNum = (int)(Math.random()*100);

        int myNum=0;
        do {
            System.out.print("Guess a number (1-100): ");
            myNum = sc.nextInt();

            if(myNum == randNum) {
                System.out.println("Woohooo!.... Your guess is right.");
                break;
            }else if(myNum > randNum) {
                System.out.println("Your number is large.");
            }else {
                System.out.println("Your number is small.");
            }
        }while(myNum >= 0);
    }
}
