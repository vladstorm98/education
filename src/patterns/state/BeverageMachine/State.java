package patterns.state.BeverageMachine;

public interface State {
    void insertMoney(BeverageMachine machine);
    void selectDrink(BeverageMachine machine);
    void dispense(BeverageMachine machine);
    void refund(BeverageMachine machine);

}
