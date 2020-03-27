/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: DateUtl.java 
 * @Prject: zheng-common
 * @Package: com.zheng.common.util 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年3月27日 上午9:51:48 
 * @version: V1.0   
 */
package com.zheng.common.util;

import java.util.Calendar;
import java.util.Date;

import javax.management.RuntimeErrorException;

/** 
 * @ClassName: DateUtl 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年3月27日 上午9:51:48  
 */
public class DateUtil {
	public static Date randomDate(Date startDate,Date endDate){
		long t1=startDate.getTime();
		long t2=endDate.getTime();
		if(t2<t1){
			throw new RuntimeException("开始日期不能大于结束日期");
		}
		long t=(long)(Math.random()*(t2-t1)+t1);
		return new Date(t);
	}
	public static Date getInitMonth(Date date){
		Calendar c = Calendar.getInstance();//获取一个日历类
		//用传入的日期初始化日历类
		c.setTime(date);
		
		c.set(Calendar.DAY_OF_MONTH, 1);//设置日历的开始日期为第一天
		c.set(Calendar.HOUR_OF_DAY, 0);//设置天的0 个小时
		c.set(Calendar.MINUTE, 0);//设置天的0 分钟
		c.set(Calendar.SECOND, 0);//设置天的0 秒
		return c.getTime();
	}
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 返回月末
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date){
		Calendar c= Calendar.getInstance();//获取日历类
		c.setTime(date);//初始化日历类
		c.add(Calendar.MONTH, 1);//
		Date initMonth = getInitMonth(c.getTime());//月份+1
		c.setTime(initMonth);//初始化日历类
		c.add(Calendar.SECOND, -1);//减去1秒
		return c.getTime();
	}
	public static int getAgeByBirthday(Date birthday){
		Calendar c=Calendar.getInstance();
		int s_year=c.get(Calendar.YEAR);
		int s_month=c.get(Calendar.MONTH);
		int s_date=c.get(Calendar.DAY_OF_MONTH);
		c.setTime(birthday);
		int b_year=c.get(Calendar.YEAR);
		int b_month=c.get(Calendar.MONTH);
		int b_date=c.get(Calendar.DAY_OF_MONTH);
		int age=s_year-b_year;
		if(b_month<s_month){
			age--;
		}
		if(s_month==b_month && b_date<s_date){
			age--;
		}
		return age;
	}
}
