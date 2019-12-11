

public class MotorCycle extends Vehicle {

    private double cylinderVolume;

    MotorCycle (String color,int noOfWheels,String regNo,Double cylinderVolume){
        this.cylinderVolume=cylinderVolume;
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.regNo=regNo;
    }

    MotorCycle (){}

    public double getCylinderVolume() {
        return cylinderVolume;
    }

    public void setCylinderVolume(double cylinderVolume) {
        this.cylinderVolume = cylinderVolume;
    }

    @Override
    public void move(){
        System.out.println("Motor Cycle with RegNo: " + this.regNo+" is ridden!");
    }

    @Override
    public String toString(){
        return "[ Motorcycle: "+ color+ ", No. of Cylinder: " + cylinderVolume + ", No. Wheels: "+ noOfWheels + ", Registration No.:"  + regNo + "]";
    }

}
