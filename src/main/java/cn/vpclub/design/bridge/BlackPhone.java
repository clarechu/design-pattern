package cn.vpclub.design.bridge;

/**
 * @ClassName BlackPhone
 * @Description TODO
 * @Author clare
 * @Date 2019-09-30 12:14
 * @Version 1.0
 */
public class BlackPhone extends Phone {


    BlackPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("手机黑色！！！");
    }


}
