package ATM.ATMStates;


import ATM.*;


public abstract class ATMState {

    public void insertCard(ATM atm, CardA card) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void authenticatePin(ATM atm, CardA card, int pin){
        System.out.println("OOPS!! Something went wrong");
    }

    public void selectOperation(ATM atm, CardA card, TransactionType txnType){
        System.out.println("OOPS!! Something went wrong");
    }

    public void cashWithdrawal(ATM atm, CardA card, int withdrawAmount){
        System.out.println("OOPS!! Something went wrong");
    }

    public void displayBalance(ATM atm, CardA card){
        System.out.println("OOPS!! Something went wrong");
    }

    public void returnCard(){
        System.out.println("OOPS!! Something went wrong");
    }

    public void exit(ATM atm){
        System.out.println("OOPS!! Something went wrong");
    }
}
