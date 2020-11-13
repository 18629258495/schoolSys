package com.lening;

/**
 * 创作时间：2020/11/10 7:59
 * 作者：王志伟
 */
public class Wang {

    public static void main(String[] args) {
        int a = 128;
        int b = 128;
        System.out.println(a == b); //①

        Integer a1 = 128;
        Integer b1 = 128;
        System.out.println(a1 == b1); //②

        Integer a2 = 127;
        Integer b2 = 127;
        System.out.println(a2 == b2); //③
    }


}
