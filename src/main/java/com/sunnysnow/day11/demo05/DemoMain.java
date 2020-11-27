package com.sunnysnow.day11.demo05;
/*
    如果接口的实现类或者父类的子类，只需要使用唯一的一次。那么这种情况下可以省略掉该类的定义，可以使用匿名内部类。
    匿名内部类的定义：
        接口名称 对象名 = new 接口名称(){
            //覆盖重写接口中所有抽象方法。
        };

    匿名内部类的注意事项：
    对格式“new 接口名称(){...}”进行解析:
     1、new代表创建对象的动作
     2、接口名称就是匿名内部类需要实现的接口
     3、{...}匿名内部类的内容

    另外还要注意几点：
     1、匿名内部类，在创建对象的时候，只能使用唯一一次。
        如果希望多次调用对象，而且类的内容一样的话，必须使用单独定义的实现类。
     2、匿名对象，再调用方法的时候只能调用唯一一次，如果希望同一个对象多次调用，则需要给对象取个名字。
     3、匿名内部类是省略了实现类或者子类，但是匿名对象是省略了对象名称。
        强调：匿名内部类和匿名对象不是一回事！！！

 */
public class DemoMain {
    public static void main(String[] args) {
        MyInterface obj1 = new MyInterfaceImpl();
        obj1.method1();

        System.out.println("=====================");

        //使用匿名内部类,但不是匿名对象，对象名就是obj2
        MyInterface obj2 =new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法111-A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222-A");
            }
        };
        obj2.method1();
        obj2.method2();

        //使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法111-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222-B");
            }
        }.method1();

        //因为匿名对象无法调用第二次方法，所以需要再创建一个匿名内部类的匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法111-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222-B");
            }
        }.method2();
    }
}
