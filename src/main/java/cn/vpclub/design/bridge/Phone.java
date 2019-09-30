package cn.vpclub.design.bridge;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author clare
 * @Date 2019-09-30 12:04
 * @Version 1.0
 */
public abstract class Phone {
    protected Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        this.brand.open();
    }

    public void close() {
        this.brand.close();
    }

}
