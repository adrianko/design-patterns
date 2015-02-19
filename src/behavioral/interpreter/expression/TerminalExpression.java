package behavioral.interpreter.expression;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String d) {
        data = d;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }

        return false;
    }

}