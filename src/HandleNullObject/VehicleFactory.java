package HandleNullObject;

public class VehicleFactory {
    static Vehicle getVehicleObject(String objType){
        if("Car".equals(objType)){
            return new Car();
        }
        return new NullVehicle();
    }
}
