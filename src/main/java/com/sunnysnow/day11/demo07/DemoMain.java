package com.sunnysnow.day11.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("小名");
        //使用匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("biubiubiu！");
            }
        };
        hero.setSkill(skill);

        hero.attack();
    }
}
