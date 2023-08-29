package com.xxx.design.example.decorator;

/**
 * 装饰抽象类
 */
public abstract class Decorator extends Component {

    protected Component component;

    // 利用setComponent方法对对象进行包装
    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    void operation() {
        if (component != null) {
            component.operation();

        }
    }
}
