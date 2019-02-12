package cn.vpclub.design.prototype;

import java.util.HashMap;

public class Manager {
    private HashMap<String, Product> showcase=new HashMap<String, Product>();

    public void register(String name ,Product product){
        showcase.put(name, product);
    }
    public Product create(String productname){
        Product p=showcase.get(productname);
        return p.creatClone();
    }

}
