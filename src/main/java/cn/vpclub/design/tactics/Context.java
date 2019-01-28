package cn.vpclub.design.tactics;

public class Context {

    private Strategy strategy;
    //策略模式  获取具体的实现
    public void getStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //通过不通的实现来调用不同的方法
    public Double ContextInterface() {
        return strategy.AigorithmInterface();
    }

}
