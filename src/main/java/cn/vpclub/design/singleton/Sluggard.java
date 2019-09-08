package cn.vpclub.design.singleton;

/**
 * @ClassName Sluggard
 * @Description TODO
 * @Author clare
 * @Date 2019-09-08 23:10
 * @Version 1.0
 */
public class Sluggard {

    private Sluggard() {}

    private static volatile Sluggard sluggard;

    // 双重判断 懒汉模式
    public static Sluggard getInstance() {
        if (sluggard == null) {
            synchronized (Sluggard.class) {
                if (sluggard == null) {
                    sluggard = new Sluggard();
                }
            }
        }
        return sluggard;
    }
}
