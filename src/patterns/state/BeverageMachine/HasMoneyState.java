package patterns.state.BeverageMachine;

public class HasMoneyState implements State {

    @Override
    public void insertMoney(BeverageMachine machine) {
        System.out.println("Money has been already inserted");
    }

    @Override
    public void selectDrink(BeverageMachine machine) {
        System.out.println("Preparing the drink...");
        machine.setState(new ReadyForDispenseState());
    }

    @Override
    public void dispense(BeverageMachine machine) {
        System.out.println("First, select a drink");
    }
    @Override
    public void refund(BeverageMachine machine) {
        System.out.println("Refunding the money...");
        machine.setState(new NoMoneyState());
    }

}
