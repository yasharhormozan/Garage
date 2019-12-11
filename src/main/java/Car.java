public class Car extends Vehicle {

    private int noOfEngine;

    Car (String color,int noOfWheels,String regNo,int noOfEngine){
        this.noOfEngine=noOfEngine;
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.regNo=regNo;
    }

    Car () {}

    public int getNoOfEngine() {
        return noOfEngine;
    }

    public void setNoOfEngine(int noOfEngine) {
        this.noOfEngine = noOfEngine;
    }

    @Override
    public void move(){
        System.out.println("Car with RegNo: " + this.regNo+" is driven!!");
    }

    @Override
    public String toString(){
        return "[ Car: "+ color+ ", NO of Engines: " + noOfEngine + ", No of Wheels: "+ noOfWheels + ", Registration No.: "  + regNo + "]";
    }
}
