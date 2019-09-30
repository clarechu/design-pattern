package cn.vpclub.design.decorator;

/**
 * @ClassName Client
 * @Description TODO
 * @Author clare
 * @Date 2019-09-30 17:05
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Drink drink = new LongBlack();
        // 加牛奶
        drink = new Milk(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDescribe());

        // 加糖
        drink = new Milk(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDescribe());

        // 加糖
        drink = new Milk(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDescribe());
    }
}
