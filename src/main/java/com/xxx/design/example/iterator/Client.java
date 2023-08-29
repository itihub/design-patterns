package com.xxx.design.example.iterator;

public class Client {

    public static void main(String[] args) {

        ConcreteAggregate aggregate = new ConcreteAggregate();

        aggregate.set(0, "大鸟");
        aggregate.set(1, "小菜");
        aggregate.set(2, "行李");
        aggregate.set(3, "老外");
        aggregate.set(4, "公交内部员工");
        aggregate.set(5, "小偷");

//        Iterator iterator = new ConcreteIterator(aggregate); // 从前往后迭代
        Iterator iterator = new ConcreteIteratorDesc(aggregate); // 从后往前迭代
        Object first = iterator.first();
        while (!iterator.isDone()) {
            System.out.println(String.format("%s 请买票!", iterator.currentItem()));
            iterator.next();
        }
    }
}
