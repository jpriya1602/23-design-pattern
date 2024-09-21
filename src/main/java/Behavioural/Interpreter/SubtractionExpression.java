package Behavioural.Interpreter;

public class SubtractionExpression extends AbstractExpression {
    AbstractExpression leftExpression;
    AbstractExpression rightExpression;
    SubtractionExpression(AbstractExpression leftExpression, AbstractExpression rightExpression){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
    @Override
    int interpret(Context context) {
        return leftExpression.interpret(context) - rightExpression.interpret(context);
    }
}
