package Behavioural.Interpreter;

public class AddExpression extends AbstractExpression{
    AbstractExpression leftExpression;
    AbstractExpression rightExpression;
    AddExpression(AbstractExpression leftExpression, AbstractExpression rightExpression){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
    @Override
    int interpret(Context context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}
