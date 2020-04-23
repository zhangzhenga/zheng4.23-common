package com.zheng.common.util;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: leovo
 * @date: 2020年4月23日 下午6:20:21
 */
public class DateUtil {
	/**
	 * 
	 * @Title: random 
	 * @Description: 随机产生一个min 和max之间的日期
	 * @param min
	 * @param max
	 * @return
	 * @return: Date
	 */
	public static Date random(Date min ,Date max) {
		long t1=min.getTime();
		long t2=max.getTime();
		long t=(long)(Math.random()*(t2-t1)+t1);
		return new Date(t);
		
	}

}
