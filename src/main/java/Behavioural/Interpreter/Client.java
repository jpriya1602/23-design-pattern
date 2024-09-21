package Behavioural.Interpreter;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        AbstractExpression expression = new AddExpression(new NumberExpression(5), new NumberExpression(10));
        System.out.println(expression.interpret(context));
    }
}
