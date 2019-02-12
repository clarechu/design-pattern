package cn.vpclub.design.builder;

public class BuilderImpl implements Builder {

    protected Person role = new Person();

    @Override
    public void buildHead() {
        role.setName("aaaa");
    }

    @Override
    public void buildFace() {
        role.setAge(1);
    }

    @Override
    public void buildBody() {
        role.setHp(1.1);
    }

    @Override
    public void buildHp() {
        role.setMp(1.1);
    }

    @Override
    public void buildSp() {
        role.setHp(1.1);
    }

    @Override
    public void buildMp() {
        role.setHp(1.1);
    }

    @Override
    public Person getPerson() {

        return role;
    }
}
