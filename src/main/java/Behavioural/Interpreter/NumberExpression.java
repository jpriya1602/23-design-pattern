package Behavioural.Interpreter;

public class NumberExpression extends AbstractExpression {

    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    int interpret(Context context) {
        return this.number;
    }
}
