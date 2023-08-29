package com.xxx.design.example.composite;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 组合中表示树叶的对象
 * 叶节点没有子节点
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        // 叶子节点没有再添加树叶或分支，所有add方法实现没有意义，但这样做可以消除叶节点和树枝节点对象在抽象层次的区别，它们具有完全一致的接口
    }

    @Override
    public void remove(Component c) {
        // 叶子节点没有再添加树叶或分支，所有remove方法实现没有意义，但这样做可以消除叶节点和树枝节点对象在抽象层次的区别，它们具有完全一致的接口
    }

    @Override
    public void display(int depth) {
        System.out.println(Stream.generate(() -> "-").limit(depth).collect(Collectors.joining()) + name);
    }
}
