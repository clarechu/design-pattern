package cn.vpclub.design.operation;

/**
 * 工厂方法*/
public class Test {

    public static void main(String[] args) {
        Operation operation = new OperationA();
        operation.createOperation().CreateOperation();
    }



}
