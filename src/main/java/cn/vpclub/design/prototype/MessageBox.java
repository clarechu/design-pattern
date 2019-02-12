package cn.vpclub.design.prototype;

public class MessageBox implements Product {

    private char decochar;

    public MessageBox(String s) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length=s.getBytes().length;
        for (int i = 0; i < length+4; i++) {
            System.out.print(decochar);
        }
        System.out.println(decochar+" "+s+" "+decochar);
        for (int i = 0; i < length+4; i++) {
            System.out.print(decochar);
        }
    }

    @Override
    public Product creatClone() {
        Product p=null;
        try {
            p=(Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
