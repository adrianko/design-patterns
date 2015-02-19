package behavioral.interpreter.expression;

public class TerminalExpression implements Expression {

    private String data;

    @Override
    public boolean interpret(String context) {
        return false;
    }

}