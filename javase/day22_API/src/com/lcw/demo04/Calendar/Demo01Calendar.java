package com.lcw.demo04.Calendar;

import java.util.Calendar;

/**
 * Create by chuanwen.li on 2019/6/22
 */

/*
    java.util.Calendar类:日历类
    Calendar类是一个抽象类,里边提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR )
    Calendar类无法直接创建对象使用,里边有一个静态方法叫getInstance(),该方法返回了Calendar类的子类对象
    static Calendar getInstance() 使用默认时区和语言环境获得一个日历。
 */
public class Demo01Calendar {


    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        System.out.println(c);
//java.util.GregorianCalendar[time=1561293627669,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=5,WEEK_OF_YEAR=26,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=174,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=40,SECOND=27,MILLISECOND=669,ZONE_OFFSET=28800000,DST_OFFSET=0]

    }


}
