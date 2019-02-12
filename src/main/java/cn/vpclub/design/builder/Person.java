package cn.vpclub.design.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
@Getter
@Setter
public class Person {

    private int age;

    private String name;

    private Double hp;   //生命值

    private Double sp;   //能量值

    private Double mp;   //魔法值

}
