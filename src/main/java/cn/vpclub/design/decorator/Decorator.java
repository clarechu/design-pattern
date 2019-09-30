package cn.vpclub.design.decorator;

/**
 * @ClassName Decoretor
 * @Description TODO
 * @Author clare
 * @Date 2019-09-30 17:00
 * @Version 1.0
 */
public class Decorator extends Drink {

    private Drink drink;


    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.getPrice() + super.getPrice();
    }


    public String getDescribe() {
        return drink.getDescribe() + "" + super.getDescribe();
    }

}
