package cn.vpclub.design.decorator;

/**
 * @ClassName Drink
 * @Description TODO
 * @Author clare
 * @Date 2019-09-30 16:56
 * @Version 1.0
 */
public abstract class Drink {

    private float price = 0.0f;

    private String describe;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public abstract float cost();

}
