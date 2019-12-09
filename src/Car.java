public class Car extends Vehicle {

    private int noOfEngine;

    Car (String color,int noOfWheels,String registrationNo,int noOfEngine){
        this.noOfEngine=noOfEngine;
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.registrationNo=registrationNo;
    }

    Car () {}

    public int getCylinderVolume() {
        return noOfEngine;
    }

    public void setNoOfEngine(int noOfEngine) {
        this.noOfEngine = noOfEngine;
    }

    public void move(){
        System.out.println("Car with RegNo: " + this.registrationNo+" is driven!!");
    }

    @Override
    public String toString(){
        return noOfEngine + "";
    }
}
