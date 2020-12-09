反射：框架设计的灵魂
    框架：半成品软件。可以再框架的基础上进行软件开发，简化代码。
    反射：将类的各个组成部分封装为其他对象，这就是反射机制
        好处：
            1.可以再程序运行过程中，操作这些对象。
            2.可以解耦，提高程序的可扩展性

    获取Class对象方式：
        1.Class.forName("全类名")：将字节码文件加载进内场，返回Class对象
            多用于配置文件，将类名定义在配置文件中，读取文件，加载类。
        2.类名.class：通过类名的属性class获取
            多用于参数的传递。
        3.对象.getClass:getClass()方法再object类中定义着。
            多用于对象的获取字节码的方式。
    结论：
        同一个字节码文件（*.class）在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的class对象都是同一个。

    使用Class对象：
       1、获取成员变量们
            Field[] getFields():获取所有public修饰的成员变量
            Field getField(String name)

            Field[] getDeclaredFields():获取所有的成员变量，不考虑修饰符
            Field getDeclaredField(String name)

       2、获取构造方法们
            Constructor<?>[] getConstructors()
            Constructor<T> getConstructor(类<?>... parameterTypes)

            Constructor<?>[] getDeclaredConstructors()
            Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)

       3、获取成员方法们
            Method[] getMethods()
            Method getMethod(String name, 类<?>... parameterTypes)

            Method[] getDeclaredMethods()
            Method getDeclaredMethod(String name, 类<?>... parameterTypes)

       4、获取类名
            String getName()

       Field:成员变量
        操作：
            1.设置值
                void set(Object obj, Object value)
            2.获取值
                Object get(Object obj)
            3.忽略访问权限修饰符的安全检查
                setAccessible(true); //暴利反射

        Constructor:构造方法
         创建对象：
                T newInstance(Object... initargs)
                如果使用空参数构造方法创建对象，操作可以简化：Class对象的newInstance方法

        Method:
          执行方法：
                Object invoke(Object obj, Object... args)
          获取方法名：
                String getName:获取方法名


