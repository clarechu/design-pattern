package cn.vpclub.design.proxy;

public class Proxy implements Subject{

    private Subject subject;
    @Override
    public void request() {
        if (subject == null) {
            subject =  new SubjectImpl();
        }
        subject.request();
    }
}
