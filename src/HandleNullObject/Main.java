package HandleNullObject;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=VehicleFactory.getVehicleObject("Car");
        printVehicleDeatils(vehicle);
    }
    private static void printVehicleDeatils(Vehicle vehicle){

        System.out.println("Seating Capacity: "+vehicle.getSeatingCapacity());
        System.out.println("Tank Capacity: "+vehicle.getTankCapacity());

    }
}
