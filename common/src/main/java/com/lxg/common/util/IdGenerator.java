package com.lxg.common.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/**
 * Created by xuegangliu on 2017/11/2.
 */
public class IdGenerator {

    public static Long generator(){
        Calendar c = Calendar.getInstance(Locale.CHINESE);
        c.set(2017,01,01,0,0,0);
        final Long sourceTime = c.getTime().getTime();
        final Long orginalTime = new Date().getTime();
        final Long time = orginalTime-sourceTime;
        final Long id = time + new Random().nextInt(1000);
        return id;
    }

    public static void main(String []args){
      System.out.print(IdGenerator.generator());
    }
}
