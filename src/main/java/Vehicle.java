

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

    public Vehicle(Builder builder) {
        this.color = builder.color;
        this.noOfWheels = builder.noOfWheels;
        this.regNo = builder.regNo;
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

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{

        public String color;
        public double cylinderVolume;
        public FuelType fuelType;
        public double length;
        public int noOfEngine;
        public int noOfSeat;
        public int noOfWheels;
        public String regNo;
        public VehicleType vehicleType;

        public Builder withColor(String color){
            this.color=color;
            return this;
        }

        public Builder withCylinderVolume (double cylinderVolume){
            this.cylinderVolume=cylinderVolume;
            return this;
        }

        public Builder withFuelType (FuelType fuelType){
            this.fuelType=fuelType;
            return this;
        }

        public Builder withLength (double length){
            this.length=length;
            return this;
        }

        public Builder withNoOfEngine(int noOfEngine){
            this.noOfEngine=noOfEngine;
            return this;
        }

        public Builder withNoOfSeat(int noOfSeat){
            this.noOfSeat=noOfSeat;
            return this;
        }


        public Builder withNoWheels(int noOfWheels){
            this.noOfWheels=noOfWheels;
            return this;
        }

        public Builder withRegNo(String regNo){
            this.regNo=regNo;
            return this;
        }

        public Vehicle build (VehicleType vehicleType){


            switch (vehicleType) {
                case AIRPLANE: {
                    return new Airplane(this);
                }
                case BOAT:{
                    return new Boat(this);
                }
                case BUS: {
                    return new Bus(this);
                }
                case CAR: {
                    return new Car(this);
                }
                case MOTORCYCLE: {
                    return new Motorcycle(this);
                }

            }     return null;
        }
    }
}
