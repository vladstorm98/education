package patterns.state.BeverageMachine;

public class NoMoneyState implements State {

    @Override
    public void insertMoney(BeverageMachine machine) {
        System.out.println("Inserting money...");
        machine.setState(new HasMoneyState());
    }

    @Override
    public void selectDrink(BeverageMachine machine) {
        System.out.println("First, insert the money");
    }

    @Override
    public void dispense(BeverageMachine machine) {
        System.out.println("First, insert the money and select a drink");
    }
    @Override
    public void refund(BeverageMachine machine) {
        System.out.println("There's no money to refund");
    }

}
