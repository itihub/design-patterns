package com.xxx.design.example.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 树枝节点行为对象，用来存储子部件
 */
public class Composite extends Component {

    // 一个子对象的集合用来存储其下属树枝节点和树叶节点
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        // 显示当前枝节点名称
        System.out.println(Stream.generate(() -> "-").limit(depth).collect(Collectors.joining()) + name);
        // 遍历枝节点下属节点
        for (Component child : children) {
            child.display(depth + 2);
        }
    }
}
