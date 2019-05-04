package edu.hm.cs.swa.cmd;

public class SubCommand implements Command {

    private Calculator calculator;
    private int left, right;

    public SubCommand(Calculator calc, int left, int right) {
        calculator = calc;
        this.left = left;
        this.right = right;
    }

    @Override
    public void execute() {
        calculator.sub(left, right);
    }
}
