package cn.vpclub.design.singleton;

/**
 * @ClassName Test
 * @Description TODO
 * @Author clare
 * @Date 2019-09-08 23:05
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Sluggard sluggard = Sluggard.getInstance();
        Sluggard sluggard1 = Sluggard.getInstance();
        System.out.println(sluggard.hashCode());
        System.out.println(sluggard1.hashCode());

        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
