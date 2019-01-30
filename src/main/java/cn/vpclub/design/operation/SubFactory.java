package cn.vpclub.design.operation;

public class SubFactory implements IFactory {
    @Override
    public void CreateOperation() {
        System.out.println("sub");
    }
}
