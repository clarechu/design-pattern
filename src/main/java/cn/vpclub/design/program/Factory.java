package cn.vpclub.design.program;

public class Factory {

    public static final String ADD = "add";

    public static final String SUBTRACT = "subtract";

    public static void main(String[] args) {
        Factory factory = new Factory();
        Count count = factory.GetMethod(ADD);
        Double res = count.GetCount(Double.valueOf("1"), Double.valueOf("2"));
        System.out.printf("result1 : %s", res);
        System.out.println();
        count = factory.GetMethod(SUBTRACT);
        res = count.GetCount(Double.valueOf("1"), Double.valueOf("2"));
        System.out.printf("result2 : %s", res);
    }

    //简单工厂模式
    public Count GetMethod(String method) {
        Count count = null;
        switch (method) {
            case ADD:
                count = new Add();
                return count;
            case SUBTRACT:
                count =  new Subtract();
                return count;
            default:
                return null;
        }
    }


}
