import java.util.Arrays;

public class Dealership {
    private Car[] cars;
    public Dealership(Car[] cars)
    {
        // this.cars=Arrays.copyOf(cars, cars.length); will still lead to error because the content will araay 
        //will still point to same refrence
        this.cars=new Car[cars.length];//creating a new array same as arguement's length
        for (int i = 0; i < cars.length; i++) {
            this.cars[i]=new Car(cars[i]);
            //will basically create new car object with same contents
            
        }
        

    }

    public String toString(){
         String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();//from Car class
            temp += carDescription + "\n";
        }
        return temp;
 
    }
    public void sell(int index){
        this.cars[index].drive();
    }

    public Car getCar(int index){
        Car copy=new Car(this.cars[index]);
        return copy;
    }
    public void setCar(int index,Car newCar){
        Car copy=new Car(newCar);
        this.cars[index]=copy;
    }


}
