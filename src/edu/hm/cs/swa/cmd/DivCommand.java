package edu.hm.cs.swa.cmd;

public class DivCommand implements Command {

    private Calculator calculator;
    private int left, right;

    public DivCommand(Calculator calc, int left, int right) {
        if(right == 0) throw new ArithmeticException("Division by zero not allowed");
        calculator = calc;
        this.left = left;
        this.right = right;
    }

    @Override
    public void execute() {
        calculator.div(left, right);
    }
}
