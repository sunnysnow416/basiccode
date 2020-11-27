package com.sunnysnow.day11.demo06;

/*
    类作为成员变量类型：
    英雄角色类
 */
public class Hero {
    private String name; //英雄名字
    private Weppen weppen; //武器
    private int age;//英雄年龄

    public Hero() {
    }

    public Hero(String name, Weppen weppen, int age) {
        this.name = name;
        this.weppen = weppen;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weppen getWeppen() {
        return weppen;
    }

    public void setWeppen(Weppen weppen) {
        this.weppen = weppen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", weppen=" + weppen +
                ", age=" + age +
                '}';
    }

    public  void  attack(){
        System.out.println("年龄为："+age+"的"+name+"用"+weppen.getCode()+"共计对方");
    }
}
