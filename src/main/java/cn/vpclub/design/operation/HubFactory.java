package cn.vpclub.design.operation;

public class HubFactory implements IFactory {
    @Override
    public void CreateOperation() {
        System.out.println("get operation");
    }
}
