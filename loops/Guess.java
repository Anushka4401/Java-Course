import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int secret=(int)((Math.random()*5)+1);
        Scanner sc=new Scanner(System.in);
        System.out.println("I choose a number between 1 to 5, Try to guess it:");
        int n=sc.nextInt();
        while (n!=secret) {
            System.out.println("Guess again:");
            n=sc.nextInt();
            
        }
        System.out.println("You got it!");
        sc.close();
    }
}
