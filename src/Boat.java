public class Boat extends Vehicle {

    private Double length;

    Boat (String color,int noOfWheels,String registrationNo,Double length){
        this.length=length;
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.registrationNo=registrationNo;
    }

    Boat(){}

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public void move(){
        System.out.println("Boat with RegNo: " + this.registrationNo+" is sailed!");
    }
}
