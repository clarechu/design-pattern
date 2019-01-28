package cn.vpclub.design.tactics;

public class Total {

    public static final String ADD = "add";

    public static final String SUBTRACT = "subtract";


    public static void main(String[] args) {
        Total total = new Total();
        Strategy strategy = total.GetMethod(ADD);
        strategy.AigorithmInterface();
    }

    public Strategy GetMethod(String method) {
        Strategy strategy = null;
        switch (method) {
            case ADD:
                strategy = new StrategyA();
                return strategy;
            case SUBTRACT:
                strategy =  new StrategyB();
                return strategy;
            default:
                return null;
        }
    }

}
