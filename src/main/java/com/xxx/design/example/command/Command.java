package com.xxx.design.example.command;

/**
 * 抽象命令
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract void execute();
}
