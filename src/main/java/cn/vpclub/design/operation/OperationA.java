package cn.vpclub.design.operation;

public class OperationA implements Operation {
    @Override
    public IFactory createOperation() {
        return new AddFactory();
    }
}
