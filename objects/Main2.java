import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        
          Person[] people = new Person[] { 
            new Person("Cleopatra", "Egypt", "69 BC", 1),
            new Person("Alexander the Great", "Macedon", "356 BC", 2),
            new Person("Julius Caesar", "Rome", "100 BC", 3),
            new Person("Hannibal", "Carthage", "247 BC", 4),
            new Person("Confucius", "China", "551 BC", 5),
            new Person("Pericles", "Greece", "429 BC", 6),
            new Person("Spartacus", "Thrace", "111 BC", 7),
            new Person("Marcus Aurelius", "Rome", "121 AD", 8),
            new Person("Leonidas", "Greece", "540 BC", 9),
            new Person("Sun Tzu", "China", "544 BC", 10),
            new Person("Hammurabi", "Babylon", "1750 BC", 11),
        };
        Airline airline = new Airline();

        for (int i = 0; i < people.length; i++) {
            airline.setPerson(people[i]);
        }
            for (int i = 0; i < people.length; i++) {
            boolean passportApproved = people[i].applyPassport();
            if (passportApproved) {
                people[i].setPassport();
                airline.createReservation(people[i]);
            } else {
                System.out.println("Sorry " + people[i].getName() + ". Your passport: " + Arrays.toString(people[i].getPassport()) + " is not valid.\n");  
            }
        }
        // Person person=new Person();
        //    person.name ="Anushka";
        // person.nationality= "India";
        // person.dateOfBirth = "04/12/2002";
        // person.passport =new String[]{person.name,person.dateOfBirth,person.nationality};
        // person.seatNumber = 101;

//   Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5); 
//   System.out.println(person);
     
//   if(person.applyPassport()){
//     person.setPassport();
//     System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");

//   }
//   else{
//       System.out.println("We are sorry " + person.getName() + ". We cannot process your application.");

//   }
//   System.out.println("Name: " + person.getName() + "\n" + "Nationality: " 
//  + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + 
//  "\n" + "Seat Number: " + person.getSeatNumber() + "\n"+"Passport: " +
//  Arrays.toString(person.getPassport()) + "\n" );
//    System.out.println("Name: " + person.getName() + "\n" + "Nationality: " 
// + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + 
// "\n" + "Seat Number: " + person.getSeatNumber() + "\n");
//         person.setName("Anushka Prakash");
//         person.setNationality("Bharat");
//         person.setDateOfBirth("05/01/2002");
//         person.setSeatNumber(201);
//        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " 
// + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + 
// "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

    
    }
}
