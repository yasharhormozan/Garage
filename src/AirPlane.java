public class AirPlane extends Vehicle {

    public int noOfSeat;

    AirPlane (String color,int noOfWheels,String registrationNo, int noOfSeat){
        this.noOfSeat=noOfSeat;
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.registrationNo=registrationNo;
    }

    AirPlane(){}

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public void move(){
        System.out.println("Airplane with RegNo: " + this.registrationNo+" is flying!");
    }
}
