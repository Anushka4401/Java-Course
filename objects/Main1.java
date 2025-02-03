
public class Main1 {
    public static void main(String[] args) {
        // Car nissan=new Car();//object of class car
        // nissan.make="Nissan";
        // nissan.color="green";
        // nissan.price=9000.40;
        // nissan.year=2018;

        // Car dodge=new Car();//also object of class car
        // dodge.make="Dodge";
        // dodge.color="red";
        // dodge.price=10000;
        // dodge.year=2024;
        

        String spareParts[]=new String[]{
          "keys","tires"
        };

        Car nissan=new Car("Nissan", 09000.40, 2018, "green",spareParts);
          //  Car nissan2 = nissan;   avoid doing this, this will cause an issue
        Car nissan2=new Car(nissan);//COPY CONSTRUCTOR
        System.out.println(nissan);


        nissan2.setColor("Yellow");
        // nissan.setColor("Orange");
        // nissan2.setColor("Blue");
        // nissan.setColor("Purple");
        // nissan2.setColor("Fuchsia");
        // nissan.setColor("Beige");
        nissan2.drive();
        Car dodge=new Car("Dodge", 10000, 2024, "blue",spareParts);
        spareParts[0]="camera sensors";

        String carParts[]=nissan.getParts();
        carParts[0]="gearbox";

        String newParts[]=new String[]{"cooler","radio"};
        nissan.setParts(newParts);
        newParts[0]="ac cooler";

        //  System.out.println("This " + nissan.make + " is worth $" + nissan.price + 
        // ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
        // System.out.println("This " + dodge.make + " is worth $" + dodge.price + 
        // ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");  
      
      //accessing values using getters
        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + 
        ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");  

        //Using setters
        // nissan.setMake("Nissan_2.0");
        // nissan.setPrice(nissan.getPrice()/2);
        // nissan.setYear(2024);
        // nissan.setColor("Black");

         System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
   
       

    
    }
}
