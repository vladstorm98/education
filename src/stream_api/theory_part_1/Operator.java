package stream_api.theory_part_1;

public class Operator {


    public void call(OperatorAction operatorAction) {
        System.out.println("Operator start calling");
        operatorAction.action();
        System.out.println("Operator end calling");
    }
}
