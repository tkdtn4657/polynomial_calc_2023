package com.ll;

public class Calc {
    //String[] a = new String[100];
    //String s;
    //int[] isInt = new int[100];
    //int isIntCount = 0;
    public static int run(String exp){
        exp = exp.replaceAll("\\- ","+ -");

        String[] bits = exp.split(" \\+ ");

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);
        int c = 0;

        if(bits.length > 2){
            c = Integer.parseInt(bits[2]);
        }

        return a + b + c;

        //throw new RuntimeException("올바른계산식이아닙니다.");

    }

}
