

abstract class Vehicle {

    public String color;
    public int noOfWheels;
    public String regNo;

    public Vehicle(String color,int noOfWheels,String regNo) {
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.regNo=regNo;
    }

    public Vehicle() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    void move(){
        System.out.println("Vehicle with RegNo: "+ this.regNo+" is moving!");
    }
}
