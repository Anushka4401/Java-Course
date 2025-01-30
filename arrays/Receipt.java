public class Receipt {
    public static void main(String[] args) {


        System.out.println("Here's your receipt:\n");
        String apples[]={"Gala", "Granny Smith", "Macintosh"};
        double price[]={1.99, 1.49, 1.29};
        
        // See instructions on Learn the Part (Workbook 6.8)
        for (int i = 0; i < price.length; i++) {
            System.out.println("\t"+apples[i]+":$"+price[i]); // to be used in for loop.


            
        }
    }
}
