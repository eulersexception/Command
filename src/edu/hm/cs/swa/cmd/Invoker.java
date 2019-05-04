package edu.hm.cs.swa.cmd;

public class Invoker {

    private Command cmd;

    // TODO implement
    public void setCommand(Calculator receiver, int left, int right, String op) {
        cmd = commandPicker(receiver, left, op, right);
        cmd.execute();
    }

    private Command commandPicker(Calculator receiver, int left, String op, int right) {

        switch (op) {

            case "/":
                return new DivCommand(receiver, left, right);

            case ":":
                return new DivCommand(receiver, left, right);

            case "*":
                return new MultCommand(receiver, left, right);

            case "-":
                return new SubCommand(receiver, left, right);

            case "+":
                return new AddCommand(receiver, left, right);

            default:
                return null;
        }
    }
}
