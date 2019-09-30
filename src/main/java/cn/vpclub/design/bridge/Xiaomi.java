package cn.vpclub.design.bridge;

/**
 * @ClassName Xiaomi
 * @Description TODO
 * @Author clare
 * @Date 2019-09-30 12:09
 * @Version 1.0
 */
public class Xiaomi implements Brand {
    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void open() {
        System.out.println("小米手机开机");
    }
}
