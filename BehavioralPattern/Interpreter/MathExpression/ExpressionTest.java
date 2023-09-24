package BehavioralPattern.Interpreter.MathExpression;

import java.util.Stack;

public class ExpressionTest
{
    public static void main(String[] args)
    {
        final var tokenString = "4 3 2 - 1 + *";
        var stack = new Stack<Expression>();
        var tokenList = tokenString.split(" ");
        for(var s : tokenList)
        {
            if(isOperator(s))
            {
                var rightExpression = stack.pop();
                var leftExpression = stack.pop();
                System.out.printf("popped from stack left: {%s} right: {%s}%n",leftExpression.interpret(),rightExpression.interpret());
                var operator = getOperatorInstance(s,leftExpression,rightExpression);
                System.out.printf("Operator: {%s}%n",operator);

                var result = operator.interpret();
                var resultExpression = new NumberExpression(result);
                stack.push(resultExpression);
                System.out.printf("push result to stack: {%s}%n",resultExpression.interpret());
            }
            else
            {
                var i = new NumberExpression(s);
                stack.push(i);
                System.out.printf("push to stack: {%s}%n",i.interpret());
            }
        }
        System.out.printf("result: {%s}%n",stack.pop().interpret());

    }

    public static boolean isOperator(String s)
    {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }

    public static Expression getOperatorInstance(String s, Expression left, Expression right) {
        return switch (s) {
            case "+" -> new PlusExpression(left, right);
            case "-" -> new MinusExpression(left, right);
            default -> new MultiplyExpression(left, right);
        };
    }
}
