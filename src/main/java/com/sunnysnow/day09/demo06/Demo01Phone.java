package com.sunnysnow.day09.demo06;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show(); //显示号码
        System.out.println("----------------");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show(); //显示号码、显示姓名、显示头像
    }
}
