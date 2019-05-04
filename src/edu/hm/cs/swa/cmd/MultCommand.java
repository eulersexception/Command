package edu.hm.cs.swa.cmd;

public class MultCommand implements Command {

    private Calculator calculator;
    private int left, right;

    public MultCommand(Calculator calc, int left, int right) {
        calculator = calc;
        this.left = left;
        this.right = right;
    }

    @Override
    public void execute() {
        calculator.mult(left, right);
    }
}
