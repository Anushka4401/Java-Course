import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            //Task 1: Create an array with three rows of '_' characters.
            char board[][]={{'_','_','_'},{'_','_','_'},{'_','_','_'}};
            printBoard(board);

            //Task 2: Call the function printBoard();
            for (int i = 0; i < 9; i++) {
              if(i%2==0){System.out.println("Turn : X");
               int xAns[]=askUser(board);
               board[xAns[0]][xAns[1]]='X';
               
              }
              else{
                System.out.println("Turn : O");
                int oAns[]=askUser(board);
                board[oAns[0]][oAns[1]]='O';

              }
              printBoard(board);
              int count=checkWin(board);
              if(count==3){
                System.out.println("X wins");
                System.exit(0);;
              }
              else if(count==-3){
                System.out.println("O wins");
                System.exit(0);;

              }
            }
            System.out.println("Tie!");
             
              /*
              {  Task 3: Loop through turns.

                  if (X) turn {
                     Task 4: call askUser(). 
                     Task 5: populate the board using askUser's return value.
                  } else {
                      Task 4: call askUser(). 
                      Task 5: populate the board using askUser's return value. Then, print it.

                  }

                Task 6 - Call the function.
                   if return value == 3 {
                     print: X wins and break the loop
                  } else if return value == -3 {
                     print: O wins and break the loop
                  }

              } 
              */

            scan.close();
        }


    /** Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines. 
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */     
    public static void printBoard(char [][] board)
    {
      System.out.println();
      for (int i = 0; i < board.length; i++) {
        System.out.print("\t");
        for (int j = 0; j < board[i].length; j++) {
          System.out.print(board[i][j]+" ");

          
        }
        System.out.print("\n\n");
        
      }



    }   

   /** Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */
    public static int[] askUser(char board[][]){
      System.out.println("pick the row and column:");
      int i=scan.nextInt();
      int j=scan.nextInt();
      while (board[i][j]!='_') {
      System.out.println("choose again");
       i=scan.nextInt();
       j=scan.nextInt();   
      }
      return new int[]{i,j};
    }

    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */
    public static int checkWin(char board[][]){
       int rows = checkRows(board); 
    
    // Math.abs returns the absolute value of a given number, removing any negative sign. 
    if (Math.abs(rows) == 3) return rows; // If the block of code consists of only one line, you can omit the curly braces.
    
    int columns = checkColumns(board);
    if (Math.abs(columns) == 3) return columns;  
    
    int leftDiagonal = checkLeft(board);
    if (Math.abs(leftDiagonal) == 3) return leftDiagonal; 
    
    int rightDiagonal = checkRight(board);
    if (Math.abs(rightDiagonal) == 3) return rightDiagonal;
    return -1;

    }


    public static int checkRows(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if(board[i][j]=='X') count++;
        else if(board[i][j]=='O') count--;
        if (Math.abs(count) == 3) {
				return count;
			} else {
				count = 0;
			}
        
      }
      
    }
    return count;
}
 
 
public static int checkColumns(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
	if (board[j][i] == 'X') {
					count++;
				} else if (board[j][i] == 'O') {
					count--;
				}
			
			if (Math.abs(count) == 3) {
				return count;
			} else {
				count = 0;
			}        
      }
    }
      
    
    return count;
}
 
 
public static int checkLeft(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
			if (board[i][i] == 'X') {
				count++;
			} else if (board[i][i] == 'O') {
				count--;
			}
		}
    return count;
}
 
 
public static int checkRight(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
			if (board[2 - i][i] == 'X') {
				count++;
			} else if (board[2 - i][i] == 'O') {
				count--;
			}
		}
    return count;
}


}
