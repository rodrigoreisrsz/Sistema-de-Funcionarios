package com.reis.dates;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {
//        LocalDate data1 = LocalDate.now();
//        System.out.println(data1); // retorna data
//        LocalDateTime data2 = LocalDateTime.now();
//        System.out.println(data2);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        //Date data = Date.from(Instant.parse("2026-08-07"));
        Calendar calendar = Calendar.getInstance();
        //calendar.setTime(data);
        //calendar.add(Calendar.HOUR_OF_DAY, 2);
        //data = calendar.getTime();
        //ystem.out.println(data);
        int hour = calendar.get(Calendar.HOUR);
        int minutes = calendar.get(Calendar.MINUTE);
        System.out.println("hour " + hour);
        System.out.println("minutes " + minutes);
    }

}
