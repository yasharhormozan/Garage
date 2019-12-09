
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garage {

    public static void main(String[] args) {

        System.out.println("What is the Max Capacity of this garage?");
        Scanner cap = new Scanner(System.in);
        int maxCap = cap.nextInt();
        System.out.println("Garage Max Cap:" + maxCap);
        List<Vehicle> garage = new ArrayList<>();

        for (int i= 0; i< maxCap; i++)
            garage.add(park()) ;

        for (int i=0;i<maxCap; i++){
            System.out.println(garage.get(i));
        }
    }

    public static Vehicle park() {

        System.out.println("Type of the vehicle: ");
        Scanner readType = new Scanner(System.in);
        String type = readType.next();

        Vehicle v = null;
        switch (type.toLowerCase()) {
            case "airplane": {
                AirPlane a = new AirPlane();
                System.out.println("No. of Seats: ");
                Scanner readNoOfSeats = new Scanner(System.in);
                a.setNoOfSeat(readNoOfSeats.nextInt());
                a.setColor("dsf");
                a.setNoOfWheels(12);
                a.setRegistrationNo("dsf");
                v = a;
                break;


            }
            case "boat": {
                Boat b = new Boat();
                System.out.println("Length: ");
                Scanner readLength = new Scanner(System.in);
                b.setLength(readLength.nextDouble());
                b.setColor("dsf");
                b.setNoOfWheels(12);
                b.setRegistrationNo("dsf");
                v = b;
                break;

            }
            case "bus": {
                Bus b = new Bus();
                System.out.println("Fuel Type: ");
                Scanner readFuelType = new Scanner(System.in);
                b.setFuelType(readFuelType.next());
                b.setColor("dsf");
                b.setNoOfWheels(12);
                b.setRegistrationNo("dsf");
                v = b;
                break;

            }
            case "car": {
                Car c = new Car();
                c.setColor("dsf");
                c.setNoOfWheels(12);
                c.setRegistrationNo("dsf");
                System.out.println("No. of Engine: ");
                Scanner readNoOfEngine = new Scanner(System.in);
                c.setNoOfEngine(readNoOfEngine.nextInt());
                v = c;
                break;

            }
            case "motorcycle": {
                MotorCycle m = new MotorCycle();
                System.out.println("No. of Cylinder: ");
                Scanner readCylinderVolume = new Scanner(System.in);
                m.setCylinderVolume(readCylinderVolume.nextDouble());
                m.setColor("dsf");
                m.setNoOfWheels(12);
                m.setRegistrationNo("dsf");
                v = m;
                break;
            }
        }
        return v;
    }
}

