package cn.vpclub.design.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Singleton
 * @Description 饥汉模式 顾名思义 初始化的时候就实例话这个对象
 * @Author clare
 * @Date 2019-09-08 23:05
 * @Version 1.0
 */
public class Singleton {

    private Singleton() {}

    private static Singleton singleton = new Singleton();

    public static Singleton getSingleton() {

        Map<String, String> map = new HashMap<>();

        return singleton;
    }
}
