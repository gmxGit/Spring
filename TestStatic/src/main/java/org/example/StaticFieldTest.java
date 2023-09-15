package org.example;

public class StaticFieldTest extends StaticFieldFather {

    public static String name;
    public int age;

    public StaticFieldTest() {
    }

    public StaticFieldTest(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        name = "小李";
        //静态方法调用非静态字段，需要实例化对象，用对象名调用
        StaticFieldTest staticFieldTest = new StaticFieldTest();
        staticFieldTest.age = 2;
        //静态方法调用静态字段,使用类名调用2  直接调用
//        StaticFieldTest.name = "小王";
        name = "haha";
        System.out.println(name + staticFieldTest.age);
        staticFieldTest.nonStatic();
        StaticFieldFather staticFieldFather = new StaticFieldFather();
        staticFieldFather.name = "父类字段";
//        staticFieldFather.StaticFather(StaticFieldTest.name);
//        staticFieldTest.StaticFather(name);
        StaticFather(name);
        StaticFieldFather.StaticFather(name);
    }

    void nonStatic() {
        //非静态方法直接调用静态方法,或者用类名调用
//        String[] args = new String[1];
//        main(args);
//        StaticFieldTest.main(args);
        System.out.println("非静态方法");

    }

    public static void StaticFather(String name) {
        System.out.println("子类方法");
    }
}