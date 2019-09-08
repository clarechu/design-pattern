package cn.vpclub.design.state;

public class WriteProgram {

    public void WriteProgram(Boolean finished, Integer Hour) {
        if (Hour < 9) {
            System.out.println("当前工作时长为: 精神百倍。。。。" +  Hour);
        }else if (Hour < 12) {
            System.out.println("当前工作时长为： 午休。。。。" +  Hour);
        }else if (Hour < 17) {
            System.out.println("下午状态不错， 继续努力。。。。"+ Hour);
        }else if (Hour < 19) {
            System.out.println("下午状态不错， 继续努力。。。。"+ Hour);
        } else {
            if (finished) {
                System.out.println("工作已完成。。。。");
            } else {
                System.out.println("工作未完成。。。。");
            }

        }
    }

}
