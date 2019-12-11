public class Bus extends Vehicle {

    private String fuelType;

    Bus (String color,int noOfWheels,String regNo,String fuelType){
        this.fuelType=fuelType;
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.regNo=regNo;
    }

    Bus (){}

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void move(){
        System.out.println("Bus with RegNo: " + this.regNo+" is driven!!");
    }

    @Override
    public String toString(){
        return "[ Bus: "+ color+ ", Fuel Type: " + fuelType + ", No of Wheels: "+ noOfWheels + ", Registration No.: "  + regNo + "]";
    }
}
