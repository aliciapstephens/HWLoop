import java.util.*;
import java.util.HashMap;

class Main {
  
  public static void main(String[] args) {
   HashMap<String, String> cars = new HashMap<String, String>();
    cars.put("Accord", "Honda");
    cars.put("G35", "Inifinti");
    cars.put("Wrangler", "Jeep");
    cars.put("Civic", "Honda");
    cars.put("Model 3", "Tesla");
    cars.put("4Runner", "Toyota");
    cars.put("CRV", "Honda");
    cars.put("MDX", "Acura");
    cars.put("Tuscon", "Hyundai");
    cars.put("Q60", "Infiniti");
    Scanner carInput = new Scanner(System.in);    System.out.println("what car (model) they are looking for?");
    String carDesc= carInput.nextLine();    
    for (String i : cars.keySet()){
        if (carDesc.equals(i)){
            System.out.println("Oh, you're looking for a " + carDesc + "?\n" + "Our" + cars.get(i) + "selection is right over here...\n");
            break;
        }
  }
  carInput.close();
}
}