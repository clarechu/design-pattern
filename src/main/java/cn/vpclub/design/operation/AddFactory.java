package cn.vpclub.design.operation;

public class AddFactory implements IFactory {
    @Override
    public void CreateOperation() {
        System.out.println("create ha");
    }
}
