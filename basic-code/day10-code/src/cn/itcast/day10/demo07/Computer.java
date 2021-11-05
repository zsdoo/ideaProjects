package cn.itcast.day10.demo07;

public class Computer {
    public void poweron(){
        System.out.println("笔记本电脑开机");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    public void usdDevice(USB usb){
        usb.open(); //打开设备
        if (usb instanceof Mouse){ //一定要先判断
            Mouse mouse=(Mouse) usb;//向下转型
            mouse.click();
        } else if (usb instanceof Keyboard) {//先判断
            Keyboard keyboard = (Keyboard) usb; //向下转型
            keyboard.type();
        }
        usb.close(); //关闭设备
    }
}
