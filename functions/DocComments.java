public class DocComments {
    public static void main(String[] args) {
        greet();
        printText("Anushka", 22);
        

        
    }
    /**
     * Function name:greet
     * 
     * Inside thr function:
     * 1.prints 'HI'
     */
    public static void greet(){
        System.out.println("Hi");
    }

   /**
    * Function name:printText
    * @param name (String)
    * @param age (int)
    *
    *Inside the function:
    * 1.print name and age of text
    *
    */
    public static void printText(String name,int age){
        System.out.println("Hi, I'm "+name+" , and "+age+" years old." );
    }

/**
 *Function name: calculateArea
 *
 * @param len (double)
 * @param wid (double)
 * @return (double)
 * Inside the function:
 * 1. This function calculates area
 */
    public static double calculateArea(double len,double wid){
        return len*wid;
    }
}
