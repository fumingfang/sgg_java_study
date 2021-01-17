package com.atguigu.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Author 扶明方
 * @Date 2021/1/13 17:31
 * @Version 1.0
 */
public class Hello {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR,-12);
        System.out.println(sdf.format(calendar.getTime()));
    }
}
