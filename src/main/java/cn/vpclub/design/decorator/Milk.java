package cn.vpclub.design.decorator;

/**
 * @ClassName Milk
 * @Description TODO
 * @Author clare
 * @Date 2019-09-30 17:09
 * @Version 1.0
 */
public class Milk extends Decorator {



    public Milk(Drink drink) {
        super(drink);
        setDescribe("牛奶");
        setPrice(5.0f);
    }
}
