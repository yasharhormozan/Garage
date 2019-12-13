public class Airplane extends Vehicle {

    private int noOfSeat;

   /* Airplane (String color,int noOfWheels,String regNo, int noOfSeat){

        this.noOfSeat=noOfSeat;
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.regNo=regNo;
    }

    Airplane (){}*/

    public Airplane(Builder builder) {

        super(builder.color,builder.noOfWheels,builder.regNo);
        this.noOfSeat = builder.noOfSeat;

    }


    public int getNoOfSeat() {
        return noOfSeat;
    }

    private void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    @Override
    public void move(){
        System.out.println("Airplane with RegNo: " + this.regNo+" is flying!");
    }

    @Override
    public String toString(){
        return "[ Airplane: "+ color+ ", No of Seats: " + noOfSeat + ", No of Wheels: "+ noOfWheels + ", Registration No.:"  + regNo + "]";
    }
}
