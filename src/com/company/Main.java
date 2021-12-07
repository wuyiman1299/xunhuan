package com.company;

public class Main {

    public static void main(String[] args) {
	//  回文数 ：指正读反读都相同的句子
        int val = 4698745;
        int zuihou = 0 ;
        while ( val != 0 ){
            zuihou = val % 10 ; //取出最后一位
            System.out.println(zuihou);
            val = val /10 ; //去除最后一位
        }
    }
}
