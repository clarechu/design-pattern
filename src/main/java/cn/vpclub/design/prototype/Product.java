package cn.vpclub.design.prototype;

public interface Product extends Cloneable {
    void use(String s);

    Product creatClone();
}
