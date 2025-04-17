package patterns.state.BeverageMachine;

public class OutOfStockState implements State {

    @Override
    public void insertMoney(BeverageMachine machine) {
        System.out.println("Beverages are out of stock. The machine doesn't accept money");
    }

    @Override
    public void selectDrink(BeverageMachine machine) {
        System.out.println("Beverages are out of stock. The machine doesn't prepare the drinks");
    }

    @Override
    public void dispense(BeverageMachine machine) {
        System.out.println("Beverages are out of stock. The machine doesn't prepare the drinks");
    }
    @Override
    public void refund(BeverageMachine machine) {
        System.out.println("There's no money to refund");
    }

}
