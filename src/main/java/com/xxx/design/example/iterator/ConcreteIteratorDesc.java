package com.xxx.design.example.iterator;

/**
 * 具体的迭代器类(从后往前迭代)
 */
public class ConcreteIteratorDesc extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        current = aggregate.count() - 1;
    }

    @Override
    public Object first() {
        return aggregate.get(aggregate.count() - 1);
    }

    @Override
    public Object next() {
        Object ref = null;
        current--;
        if (current >= 0) {
            ref = aggregate.get(current);
        }
        return ref;
    }

    @Override
    public boolean isDone() {
        return current < 0 ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);
    }
}
