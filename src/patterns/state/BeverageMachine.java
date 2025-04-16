package patterns.state;

import lombok.Setter;

@Setter
public class BeverageMachine {
    private State state;

    public BeverageMachine() {
        this.state = new OutOfStockState();
    }

    public void insertMoney() {
        state.insertMoney(this);
    }

    public void selectDrink() {
        state.selectDrink(this);
    }

    public void dispense() {
        state.dispense(this);
    }

    public void refund() {
        state.refund(this);
    }

    public void putComponents() {
        state = new NoMoneyState();
    }
}

interface State {
    void insertMoney(BeverageMachine machine);
    void selectDrink(BeverageMachine machine);
    void dispense(BeverageMachine machine);
    void refund(BeverageMachine machine);

}

class NoMoneyState implements State {

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

class HasMoneyState implements State {

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

class ReadyForDispenseState implements State {

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

class OutOfStockState implements State {

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

class Main {
    public static void main(String[] args) {
        var machine = new BeverageMachine();
        machine.putComponents();

        machine.insertMoney();
        machine.selectDrink();
        machine.dispense();
        machine.refund();

        machine.insertMoney();
        machine.insertMoney();
        machine.refund();
    }
}
