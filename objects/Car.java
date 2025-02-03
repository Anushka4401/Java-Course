import java.util.Arrays;

public class Car{
    //class is blueprint for objects
   private String make;
    private double price;
     private int year;
    private String color;
    private String parts[];
    //we have set our fields as private to ensure encapsulation
    //private to only class in which it is created
    

    //Constructor
    public Car(String make,double price,int year,String color,String parts[]){
        this.make=make;
        //this refers to current object's field
        this.price=price;
        //the R.H.S is the parameters, it's value is same as the arguements
        //passed during constructor calling
        this.year=year;
        this.color=color;
        // this.parts=parts; dont do this as -arrays are mutable, so using same varibale to point to same reference
        //any changes made in the arguements parts[] array will be reflected  to current objects array
        this.parts=Arrays.copyOf(parts, parts.length);
    }


    //COPY CONSTRUCTOR
    public Car(Car src){
       this.make=src.make;
       this.price=src.price;
       this.year=src.year;
       this.color=src.color;
    //    this.parts=src.parts; dont do this(same reason above)
    this.parts=Arrays.copyOf(src.parts, src.parts.length);
    }



    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String[] getParts(){
        return Arrays.copyOf(this.parts, this.parts.length);
    }
    public void setParts(String parts[]){
        this.parts=Arrays.copyOf(parts, parts.length);
    }

    //drive method
    public void drive(){
        System.out.println("Driving "+make+" of color "+color+" made in year "+year+" bought only in "+price);
    }
    public String toString(){
                return "Make: " + this.make + ".\n" 
            +  "Price: " + this.price + ".\n"
            +  "Year: " + this.year + ".\n"
            +  "Color: " + this.color + ".\n"
            +  "Parts: " + Arrays.toString(parts) + ".\n";

    }
   


    
}