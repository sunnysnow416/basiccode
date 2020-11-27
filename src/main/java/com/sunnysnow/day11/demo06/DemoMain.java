package com.sunnysnow.day11.demo06;

//类作为成员变量类型：
public class DemoMain {
    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero = new Hero();
        hero.setAge(20);
        hero.setName("伊丽莎白");
        Weppen weppen = new Weppen("多兰剑");
        hero.setWeppen(weppen);
        hero.attack(); //年龄为：20的伊丽莎白用多兰剑共计对方

        Hero hero2 =new Hero("张三",new Weppen("大刀"),18);
        hero2.attack(); //年龄为：18的张三用大刀共计对方
    }
}
