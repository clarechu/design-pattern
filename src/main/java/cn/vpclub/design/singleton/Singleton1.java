package cn.vpclub.design.singleton;

/**
 * @ClassName Singleton
 * @Description 饥汉模式 顾名思义 初始化的时候就实例话这个对象
 * @Author clare
 * @Date 2019-09-08 23:05
 * @Version 1.0
 */
public class Singleton1 {

    private Singleton1() {
    }

    private static Singleton1 singleton;

    //静态类部类
    private static class LazyHolder {
        private static final Singleton1 INSTANCE = new Singleton1();
    }


    public static final Singleton1 getInstance1() {
        return LazyHolder.INSTANCE;
    }
}
