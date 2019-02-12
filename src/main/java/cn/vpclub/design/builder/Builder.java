package cn.vpclub.design.builder;

public interface Builder {

     void buildHead();

     void buildFace();

     void buildBody();

     void buildHp();

     void buildSp();

     void buildMp();

     Person getPerson();
}
