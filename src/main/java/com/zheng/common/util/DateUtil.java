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
}
