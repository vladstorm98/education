package patterns.state.BeverageMachine;

public class ReadyForDispenseState implements State {

    @Override
    public void insertMoney(BeverageMachine machine) {
        System.out.println("First, take the prepared drink");
    }

    @Override
    public void selectDrink(BeverageMachine machine) {
        System.out.println("First, take the prepared drink");
    }

    @Override
    public void dispense(BeverageMachine machine) {
        System.out.println("Dispensing the drink...");
        machine.setState(new NoMoneyState());
    }
    @Override
    public void refund(BeverageMachine machine) {
        System.out.println("There's no money to refund");
    }

}
