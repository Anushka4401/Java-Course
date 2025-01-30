import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hi Bart.I can write lines for you.\nWhat do you wantme to write?");
        String message=sc.nextLine();
        for(int i=0;i<100;i++){
            System.out.println(message);
        }
        sc.close();
    }
}
