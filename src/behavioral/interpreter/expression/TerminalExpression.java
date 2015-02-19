package behavioral.interpreter.expression;

public class TerminalExpression implements Expression {

    @Override
    public boolean interpret(String context) {
        return false;
    }

}