public class Bus extends Vehicle {

    private String fuelType;

    Bus (String color,int noOfWheels,String registrationNo,String fuelType){
        this.fuelType=fuelType;
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.registrationNo=registrationNo;
    }

    Bus (){}

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void move(){
        System.out.println("Bus with RegNo: " + this.registrationNo+" is driven!!");
    }
}
