

abstract class Vehicle {

    public String color;
    public int noOfWheels;
    public String registrationNo;

    public Vehicle(String color,int noOfWheels,String registrationNo) {
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.registrationNo=registrationNo;
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

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    void move(){
        System.out.println("Vehicle with RegNo: "+ this.registrationNo+" is moving!");
    }
}
