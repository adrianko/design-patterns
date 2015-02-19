package behavioral.interpreter.expression;

public class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    @Override
    public boolean interpret(String context) {
        return false;
    }

}