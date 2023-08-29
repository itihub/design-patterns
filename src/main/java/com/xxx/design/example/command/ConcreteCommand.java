package com.xxx.design.example.command;

public class ConcreteCommand extends Command {


    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        receiver.action();
    }
}
