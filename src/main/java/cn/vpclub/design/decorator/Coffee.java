package cn.vpclub.design.decorator;

/**
 * @ClassName Coffee
 * @Description TODO
 * @Author clare
 * @Date 2019-09-30 16:57
 * @Version 1.0
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return getPrice();
    }
}
