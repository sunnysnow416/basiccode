package com.sunnysnow.day14.demo05.Thread;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void run(){
        //定于循环执行20此
        for(int i=0;i<20;i++){
            System.out.println(name+"--->"+i);
        }
    }
}
