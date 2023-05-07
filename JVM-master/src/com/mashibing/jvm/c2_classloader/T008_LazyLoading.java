package com.mashibing.jvm.c2_classloader;

public class T008_LazyLoading { //严格讲应该叫lazy initialzing，因为java虚拟机规范并没有严格规定什么时候必须loading,但严格规定了什么时候initialzing
    public static void main(String[] args) throws Exception {
//        P p;//不会打印，我没有new，不会加载
//        X x = new X();//P是X的父类，x new了，所以X被加载，那么P作为父类也会加载
//        System.out.println(P.i);//final，不需要加载
//        System.out.println(P.j);//需要加载
//        Class.forName("com.mashibing.jvm.c2_classloader.T008_LazyLoading$P");//需要加载

    }

    public static class P {
        final static int i = 8;
        static int j = 9;
        static {
            System.out.println("P");
        }
    }

    public static class X extends P {
        static {
            System.out.println("X");
        }
    }
}
