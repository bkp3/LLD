package HandleNullObject;

public class Car implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 48;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}
