

public class MotorCycle extends Vehicle {

    private Double cylinderVolume;

    MotorCycle (String color,int noOfWheels,String registrationNo,Double cylinderVolume){
        this.cylinderVolume=cylinderVolume;
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.registrationNo=registrationNo;
    }

    MotorCycle (){}

    public Double getCylinderVolume() {
        return cylinderVolume;
    }

    public void setCylinderVolume(Double cylinderVolume) {
        this.cylinderVolume = cylinderVolume;
    }

    public void move(){
        System.out.println("Motor Cycle with RegNo: " + this.registrationNo+" is ridden!");
    }

}
