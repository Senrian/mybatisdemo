package com.zpc.mybatis.test;

import com.zpc.mybatis.test.B;

public class StringTest extends B {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
       // s.append("");
        cc(s);
        bb(s);
        aa(s);
        System.out.println(s);
    }

    private static void cc(StringBuilder s) {
        s.append("jjj"+",");
}
    private static void bb(StringBuilder s) {
        s.append("kkk"+",");
    }
    private static void aa(StringBuilder s) {
        s.append("lll"+",");
    }

    @Override
    public void AA() {
        System.out.println("实现A方法");
    }

    @Override
    public void CC() {

    }
}

