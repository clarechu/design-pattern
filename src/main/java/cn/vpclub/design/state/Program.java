package cn.vpclub.design.state;

public class Program {
    public void WriteProgram(Boolean finished, Integer Hour) {
        if (Hour < 9) {
            System.out.println("当前工作时长为: 精神百倍。。。。" +  Hour);
        }else if (Hour < 12) {
            System.out.println("当前工作时长为： 午休。。。。" +  Hour);
        }
    }
}

