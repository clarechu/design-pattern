# 设计模式

## 设计模式的六大原则

1. 单一职责

一个类只负责一项职责，尽量做到类的只有一个行为原因引起变化；

2. 接口隔离

建立单一接口；（扩展为类也是一种接口，一切皆接口）

3. 里矢替换

子类可以扩展父类的功能，但不能改变原有父类的功能；

尽量不要修改父类的方法

4. 依赖倒置原则

抽象就是接口或者抽象类，细节就是实现类
上层模块不应该依赖下层模块，两者应依赖其抽象；
抽象不应该依赖细节，细节应该依赖抽象；

5. 开闭原则

用抽象构建架构，用实现扩展原则；
 对修改关闭 对增加开放

6. 迪米特原则

最少知道原则，尽量降低类与类之间的耦合；

一个对象应该对其他对象有最少的了解


## 单例模式

### 饥汉模式

这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。

```java
public class Singleton {
 
   //创建 SingletonObject 的一个对象
   private static Singleton instance = new Singleton();
 
   //让构造函数为 private，这样该类就不会被实例化
   private Singletonton(){}
 
   //获取唯一可用的对象
   public static Singleton getInstance(){
      return instance;
   }

}
```

线程安全的 在静态方法前面加入了关键字 `synchronized` 

```java
public class Singleton {  
    private static Singleton instance;  
    private Singleton (){}  
    public static synchronized Singleton getInstance() {  
    if (instance == null) {  
        instance = new Singleton();  
    }  
    return instance;  
    }  
}
```

测试

```java
public class Test {

    public static void main(String[] args) {

        Singletonton Singletonton = Singletonton.getSingletonton();
        Singletonton Singletonton1 = Singletonton.getSingletonton();
        System.out.println(Singletonton.hashCode());
        System.out.println(Singletonton1.hashCode());
    }
}



```

```text

结果如下：

791452441
791452441
```

### 懒汉模式

这种方式比较常用，但容易产生垃圾对象。
优点：没有加锁，执行效率会提高。
缺点：类加载时就初始化，浪费内存。
它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。


```java
public class Singleton {  
    private static Singleton instance = new Singleton();  
    private Singleton (){}  
    public static Singleton getInstance() {  
    return instance;  
    }  
}
```

双重绑定

```java
public class Singleton {  
    private volatile static Singleton singleton;  
    private Singleton (){}  
    public static Singleton getSingleton() {  
    if (singleton == null) {  
        synchronized (Singleton.class) {  
        if (singleton == null) {  
            singleton = new Singleton();  
        }  
        }  
    }  
    return singleton;  
    }  
}
```


建造者模式

将产品与建造产品的过程进行分离

```java

```