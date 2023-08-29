package com.xxx.design.example.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚集类
 */
public class ConcreteAggregate extends Aggregate {

    // 存放聚合对象
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    // 返回聚集总个数
    public int count() {
        return items.size();
    }

    public Object get(int index) {
        return items.get(index);

    }

    public void set(int index, Object value) {
        items.add(index, value);
    }


}
