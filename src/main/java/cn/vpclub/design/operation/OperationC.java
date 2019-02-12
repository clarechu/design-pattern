package cn.vpclub.design.operation;

public class OperationC implements Operation {
    @Override
    public IFactory createOperation() {
        return new HubFactory();
    }
}
