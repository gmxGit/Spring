package org.example;

public class StaticFieldFather {
    String name = null;

    public static void StaticFather(String name) {
        name = "111";
        System.out.println("静态字段父类" + name);
    }

    private void StaticFatherPrivate() {
        System.out.println("静态父类私有方法");

    }
}
