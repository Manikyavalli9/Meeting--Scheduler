package com.meetings;


import java.text.SimpleDateFormat;
import java.util.Date;
public class Program
{
    public static void main(String[] args) {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
        Date date= new Date();
        System.out.println(sdf.format(date));
        System.out.println("2011-03-21\n" + "09:00 11:00 EMP002\n"
				+ "2011-03-22\n" + "14:00 16:00 EMP003\n"
				+ "16:00 17:00 EMP004\n");
    }
}