

public class Motorcycle extends Vehicle {

    private double cylinderVolume;

    /*Motorcycle (String color,int noOfWheels,String regNo,Double cylinderVolume){
        this.cylinderVolume=cylinderVolume;
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.regNo=regNo;
    }

    Motorcycle (){}*/

    public Motorcycle(Builder builder) {
        super(builder.color, builder.noOfWheels, builder.regNo);
        this.cylinderVolume = builder.cylinderVolume;
    }

    public double getCylinderVolume() {
        return cylinderVolume;
    }

    private void setCylinderVolume(double cylinderVolume) {
        this.cylinderVolume = cylinderVolume;
    }

    @Override
    public void move(){
        System.out.println("Motorcycle with RegNo: " + this.regNo+" is ridden!");
    }

    @Override
    public String toString(){
        return "[ Motorcycle: "+ color+ ", No. of Cylinder: " + cylinderVolume + ", No. Wheels: "+ noOfWheels + ", Registration No.:"  + regNo + "]";
    }

}
