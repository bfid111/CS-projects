
import java.util.Stack;
import java.util.StringTokenizer;


public class Driver {
    private static final char add = '+',  sub = '-';
    private static final char mult = '*', div= '/';
    private Stack stack;

    public Driver() {
        stack = new Stack();
    }
    public int evaluate(String expr) {
        stack = new Stack();
        int pop1,pop2;
        int result = 0;
        String token;
        StringTokenizer tokenizer = new StringTokenizer(expr);

        while (tokenizer.hasMoreTokens()) {
            token = tokenizer.nextToken();

            if (isOperator(token)) {
                pop2 = ((Integer) stack.pop());
                pop1 = ((Integer) stack.pop());
                result = operators(token.charAt(0), pop1, pop2);
                stack.push(result);
            }
            else
                stack.push(Integer.parseInt(token));
        }
        result = ((Integer) stack.pop());
        return result;
    }
    private boolean isOperator(String token) {
        return (
            token.equals("+")
                || token.equals("-")
                || token.equals("*")
                || token.equals("/"));
    }
    private int operators(char operation, int op1, int op2) {
        int result = 0;

        switch (operation) {
            case add :
                result = op1 + op2;
                break;
            case sub :
                result = op1 - op2;
                break;
            case  mult :
                result = op1 * op2;
                break;
            case div :
                result = op1 / op2;
        }
        return result;
    }
}
