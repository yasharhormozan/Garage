public class Bus extends Vehicle {

    private FuelType fuelType;

   /* Bus (String color,int noOfWheels,String regNo,FuelType fuelType){
        this.fuelType=fuelType;
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.regNo=regNo;
    }

    Bus (){}*/

    public Bus(Builder builder) {
        super(builder.color, builder.noOfWheels, builder.regNo);
        this.fuelType = builder.fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    private void setFuelType(FuelType fuelType) {
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
