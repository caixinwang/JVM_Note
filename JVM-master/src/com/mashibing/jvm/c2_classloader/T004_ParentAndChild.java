package com.mashibing.jvm.c2_classloader;

public class T004_ParentAndChild {
    public static void main(String[] args) {
        System.out.println(T004_ParentAndChild.class.getClassLoader());//App
        System.out.println(T004_ParentAndChild.class.getClassLoader().//App
                getClass().getClassLoader());//BootStrap
        System.out.println(T004_ParentAndChild.class.getClassLoader().//App
                getParent());//Extension
        System.out.println(T004_ParentAndChild.class.getClassLoader().//App
                getParent().//Extension
                getParent());//BootStrap
        //System.out.println(T004_ParentAndChild.class.getClassLoader().getParent().getParent().getParent());

    }
}
