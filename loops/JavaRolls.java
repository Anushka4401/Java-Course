import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        
        int diceRoll;
        int score = 0;
        System.out.println("Let's play Rolling Java. Type anything to start");
        scan.nextLine();
        System.out.println(">> Great, here are the rules:\n >> - If you roll a 6, the game stops.\n>> - If you roll a 4, nothing happens.\n>> - Otherwise, you get 1 point.\n\n>> You must collect at least 3 points to win. \nEnter anything to roll:");
        scan.nextLine();
        while (true) {
             diceRoll=rollDice();
            System.out.println("You rolled a "+diceRoll);
            if (diceRoll==6) {
                System.out.println("End of game");
                break;
            }
            else if(diceRoll==4){
                System.out.println("Zero points. Keep rolling.");
            }
            else{
                score+=1;
                System.out.println("One point. Keep rolling.");
            }
            
        }
        if(score>=3){
            System.out.println("Wow, that's lucky. You win!");
        }
        else{
            System.out.println("Tough luck, you lose :(");
        }
        scan.close();
    }
  public static int rollDice(){
        return (int)(Math.random()*6)+1;
    }
  

  
  
}
