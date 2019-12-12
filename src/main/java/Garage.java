
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garage {


    public static int parkedNo;
    static List<Vehicle> garage = new ArrayList<>();



    public static void main(String[] args) {

        //Garage garage = new Garage();

        String answer;
        System.out.println("What is the Max Capacity of this garage?");
        Scanner cap = new Scanner(System.in);
        int maxCap = cap.nextInt();

        do {

            System.out.println("Would you like to park or unpark a vehicle?");
            Scanner parkOrUnPark = new Scanner(System.in);
            String task = parkOrUnPark.next();

            if (task.toLowerCase().equals("park") ) {
                if (parkedNo <maxCap){
                    Vehicle vehicle = create();
                    park (vehicle);
                }else {

                    System.out.println("Garage is at max capacity!");

                }

            } else if (task.toLowerCase().equals("unpark")){

                System.out.println("Please enter the registration No. of the vehicle to be unparked:");
                Scanner whichCar = new Scanner(System.in);
                String regNo = whichCar.next();
                unpark(findVehicleByRegNo(regNo));

            } else
                System.out.println("Unavailable Request!");

            System.out.println("Would you like to continue?");
            Scanner exit = new Scanner(System.in);
            answer = exit.next();

        } while (((answer.equals("yes") ) || (answer.equals("y") )));

        for (Vehicle vehicle: Garage.garage) {
            System.out.println(vehicle.toString());
        }
    }

    public static Vehicle findVehicleByRegNo(String regNo) {
        Vehicle vehicle = null;
        for (Vehicle v : Garage.garage) {
            if (v.getRegNo().equals(regNo) ){
                vehicle = v;
            }
        }
        return vehicle;
    }

    public static List<Vehicle> findVehicleByColor(String color) {

        List<Vehicle> garageByColor = new ArrayList<Vehicle>();

        for (Vehicle vehicle : Garage.garage) {
            if (vehicle.getRegNo().equals(color) ){
                garageByColor.add(vehicle);
            }

        }
        return garageByColor;
    }

    public static List<Vehicle> findVehicleByNoOfWheels(int noOfWheels) {

        List<Vehicle> garageByNoOfWheels = new ArrayList<Vehicle>();

        for (Vehicle vehicle : Garage.garage) {

            if (vehicle.getNoOfWheels()== noOfWheels){
                garageByNoOfWheels.add(vehicle);
            }

        }
        return garageByNoOfWheels;
    }

    public static List<Airplane> findVehicleByNoOfSeat(int noOfSeat) {

        List<Airplane> garageByNoOfSeat = new ArrayList<Airplane>();

        for (Vehicle airplane: Garage.garage) {
            if (((Airplane)airplane).getNoOfSeat()== noOfSeat) {
                garageByNoOfSeat.add((Airplane)airplane);
            }
        }
        return garageByNoOfSeat;
    }

    public static List<Boat> findVehicleByLength(double length) {

        List<Boat> garageByLength = new ArrayList<Boat>();

        for (Vehicle boat: Garage.garage) {
            if (((Boat)boat).getLength() == length) {
                garageByLength.add((Boat) boat);
              }
        }
        return garageByLength;
    }

    public static List<Car> findVehicleByNoOfEngine(int noOfEngine) {

        List<Car> garageByNoOfEngine = new ArrayList<Car>();

        for (Vehicle car: Garage.garage) {
            if (((Car)car).getNoOfEngine() == noOfEngine ) {
                garageByNoOfEngine.add((Car)car);
            }
        }
        return garageByNoOfEngine;
    }

    public static List<Bus> findVehicleByFuelType(FuelType fuelType) {

        List<Bus> garageByFuelType = new ArrayList<Bus>();

        for (Vehicle bus: Garage.garage) {
            if (((Bus)bus).getFuelType() == fuelType ) {
                garageByFuelType.add((Bus)bus);
            }
        }
        return garageByFuelType;
    }

    public static List<Motorcycle> findVehicleByCylinderVolume(double cylinderVolume) {

        List<Motorcycle> garageByCylinderVolume = new ArrayList<Motorcycle>();

        for (Vehicle motorcycle: Garage.garage) {
            if (((Motorcycle)motorcycle).getCylinderVolume() == cylinderVolume ) {
                garageByCylinderVolume.add((Motorcycle) motorcycle);
            }
        }
        return garageByCylinderVolume;
    }



    public static void park (Vehicle vehicle){
        garage.add(vehicle);
        parkedNo++;
    }

    public static void unpark (Vehicle vehicle){
        garage.remove(vehicle);
        parkedNo--;
    }

    public static Vehicle create() {
        
        String regNo;
        String color;
        int noOfWheels;

        System.out.println("Type of the vehicle: ");
        Scanner readType = new Scanner(System.in);
        String type = readType.next();

        System.out.println("Registration No.: ");
        Scanner readRegNo = new Scanner(System.in);
        regNo =readRegNo.next();

        System.out.println("Color: ");
        Scanner readColor = new Scanner(System.in);
        color = readColor.next();

        System.out.println("No. of Wheels: ");
        Scanner readNoOfWheels = new Scanner(System.in);
        noOfWheels = readNoOfWheels.nextInt();

        switch (type.toLowerCase()) {
            case "airplane": {
                int noOfSeats;
                System.out.println("No. of Seats: ");
                Scanner readNoOfSeats = new Scanner(System.in);
                noOfSeats = readNoOfSeats.nextInt();
                return new Airplane(color, noOfWheels,regNo, noOfSeats);
            }
            case "boat": {
                double length;
                System.out.println("Length: ");
                Scanner readLength = new Scanner(System.in);
                length = readLength.nextDouble();
                return new Boat(color,noOfWheels,regNo,length);
            }
            case "bus": {
                String fuelType;
                System.out.println("Fuel Type: ");
                Scanner readFuelType = new Scanner(System.in);
                fuelType= readFuelType.next();
                return new Bus(color,noOfWheels,regNo,FuelType.valueOf(fuelType));
            }
            case "car": {
                int noOfEngine;

                System.out.println("No. of Engine: ");
                Scanner readNoOfEngine = new Scanner(System.in);
                noOfEngine=readNoOfEngine.nextInt();
                return new Car (color,noOfWheels,regNo,noOfEngine);

            }
            case "motorcycle": {
                double cylinderVolume;
                System.out.println("No. of Cylinder: ");
                Scanner readCylinderVolume = new Scanner(System.in);
                cylinderVolume = readCylinderVolume.nextDouble();
                return new Motorcycle(color,noOfWheels,regNo,cylinderVolume);
            }
            default: {

                System.out.println("Vehicle Type is not recognized!");

            }
        }
        return null;
    }
}

