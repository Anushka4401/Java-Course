
public class ReturnValues {
    public static void main(String[] args) {
        double area1=calculateArea(2.1,3);
        printArea(2.1, 3, area1);
        double area2=calculateArea(3.1,8);
        double area3=calculateArea(34.2,3.67);
        System.out.println("area of 1 st rectangle= "+area1);
        System.out.println("area of 2 nd rectangle= "+area2);
        System.out.println("area of 3rd rectangle= "+area3);
        calculateArea(-33, 3.5);
        String engExplain=explainArea("English");
        String spanishExplain=explainArea("Spanish");
        String frenchExplain=explainArea("French");


    }
    public static double calculateArea(double len,double wid){
        //len and wid are called parameters here
        if(len<0 ||wid<0) {
            System.out.println("Invalid dimension");
            System.exit(0);
        }
        double area=len*wid;
        return area;
    }
    public  static String explainArea(String lang){
        switch (lang) {
            //not using any break command because return will directly exit from the function
            //whenever the case watches
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
        
            default:
                return "Language not found";
        }
    }
    public static void printArea(double len,double wid,double area){
        System.out.println("Area of rectangle with length= "+len+" and width= "+wid+"= "+area);
    }
}
