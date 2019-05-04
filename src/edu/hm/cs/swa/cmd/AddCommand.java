package edu.hm.cs.swa.cmd;

public class AddCommand implements Command {

    private Calculator calculator;
    private int left, right;

    public AddCommand(Calculator calc, int left, int right) {
        calculator = calc;
        this.left = left;
        this.right = right;
    }

    @Override
    public void execute() {
        calculator.add(left, right);
    }
}
