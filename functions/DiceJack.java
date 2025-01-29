import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        int roll1= rollADice();
        int roll2=rollADice();
        int roll3=rollADice();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(notInRange(n1,n2,n3)){
            System.out.println("Please enter in  valid range between 1 to 6");
            System.exit(0);

        }
        System.out.println("Dice rolled:\n"+roll1+"\n"+roll2+"\n"+roll3);
        int sumNum=n1+n2+n3;
        int sumDice=roll1+roll2+roll3;
        System.out.println("Your sum="+sumNum+"\t Dice Sum="+sumDice);
        if(userWon(sumNum,sumDice)){
            System.out.println("You won!");
        }
        else{
            System.out.println("Better luck next time.");
        }
        sc.close();


    }
    public static boolean notInRange(int n1,int n2,int n3){
        return (n1<1 || n2<1 || n3<1 )||(n1>6|| n2>6 || n3>6);
    }
    public static int rollADice(){
        double randomNumber=(Math.random()*6)+1;
        return (int)randomNumber;
    }

    public static boolean userWon(int sumNum,int sumDice){
        return (sumNum>sumDice && (Math.abs(sumDice-sumNum))<3);
    }
}
