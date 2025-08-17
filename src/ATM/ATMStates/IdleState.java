package ATM.ATMStates;


import ATM.*;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, CardA card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}

