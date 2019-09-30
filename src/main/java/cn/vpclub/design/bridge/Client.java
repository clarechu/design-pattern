package cn.vpclub.design.bridge;

/**
 * @ClassName Client
 * @Description 客户端
 * @Author clare
 * @Date 2019-09-30 12:17
 * @Version 1.0
 */
public class Client {


    public static void main(String[] args) {
        Phone phone1 = new BlackPhone(new Xiaomi());
        phone1.open();
    }
}
