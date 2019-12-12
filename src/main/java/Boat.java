public class Boat extends Vehicle {

    private double length;

    Boat (String color,int noOfWheels,String regNo,double length){
        this.length=length;
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.regNo=regNo;
    }

    Boat(){}

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void move(){
        System.out.println("Boat with RegNo: " + this.regNo+" is sailed!");
    }

    @Override
    public String toString(){
        return "[ Boat: "+ color+ ", Length: " + length + ", No of Wheels: "+ noOfWheels + ", Registration No."  + regNo + "]";
    }
}
