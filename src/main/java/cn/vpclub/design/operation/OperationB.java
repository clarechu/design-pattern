package cn.vpclub.design.operation;

public class OperationB implements Operation {
    @Override
    public IFactory createOperation() {

        return new SubFactory();
    }
}
