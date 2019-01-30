package cn.vpclub.design.decorate;

/**
 *
 * 装饰者模式*/
public class Decorate implements Compoment{

    private Compoment compoment;

    public void setCompoment(Compoment compoment){
        this.compoment = compoment;
    }

    @Override
    public Double getPrice() {
       return compoment.getPrice();
    }
}
