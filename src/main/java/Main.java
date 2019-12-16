import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /*------ADD TO GARAGE
    * GarageHandler.add(new Car(Color.GREEN,"A123",4));
    * GarageHandler.add(new AirPlane(Color.BLUE,"A223"));
    * GarageHandler.add(new Boat(Color.RED,"A323","M8000"));
    *
    * ------- REMOVE From GARAGE
    * GarageHandler.remove(GarageHandler.find("A123"));
    *
    * GarageHandle.showContent()
    *
    * GarageHandle.isEmpty("")
    *
    * */


    static Garage garage = new Garage();
    static GarageHandler garageHandler = new GarageHandler();


   public static void main(String[] args) {
       GarageHandler.run();

    }
}
