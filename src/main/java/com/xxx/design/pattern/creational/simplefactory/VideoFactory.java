package com.xxx.design.pattern.creational.simplefactory;

/**
 * 简单工厂类
 */
public class VideoFactory {

    /**
     * 简单工厂
     * 缺点：增加新的子类需要修改工厂判断逻辑，不符合开闭原则
     * @param type
     * @return
     */
    public BaseVideo getVideo(String type){
        if ("java".equals(type)){
            return new JavaVideo();
        }else if ("python".equals(type)){
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 使用反射的方式来创建对象，扩展无需重写工厂逻辑
     * 缺点：反射性能不好
     * @param clazz
     * @return
     */
    public BaseVideo getVideo2(Class clazz){

        BaseVideo video = null;

        try {
            video = (BaseVideo) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return video;
    }
}
