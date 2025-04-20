package patterns.state.BeverageMachine;

public class Main {
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
