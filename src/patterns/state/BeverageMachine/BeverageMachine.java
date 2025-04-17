package patterns.state.BeverageMachine;

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

