package stream_api.theory_part_1;

public class HighOrderFunctionExample {
    public static void main(String[] args) {
        Operator operator = new Operator();
        OperatorAction creditCardAction = () -> System.out.println("creditCardAction");
        OperatorAction linkAction = () -> System.out.println("linkAction");
        OperatorAction socialAction = () -> System.out.println("socialAction");

        operator.call(creditCardAction);
        operator.call(linkAction);
        operator.call(socialAction);
    }
}
