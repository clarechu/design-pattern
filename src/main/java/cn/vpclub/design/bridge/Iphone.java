package cn.vpclub.design.bridge;

/**
 * @ClassName Iphone
 * @Description TODO
 * @Author clare
 * @Date 2019-09-30 12:10
 * @Version 1.0
 */
public class Iphone implements Brand {
    @Override
    public void close() {
        System.out.println("魅族手机关机！！！");
    }

    @Override
    public void open() {
        System.out.println("魅族手机开机！！！");
    }
}
