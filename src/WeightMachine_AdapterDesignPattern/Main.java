package WeightMachine_AdapterDesignPattern;

import WeightMachine_AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import WeightMachine_AdapterDesignPattern.Adapter.WeightMachineAdapter;
import WeightMachine_AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}


/*
12.6
* */
