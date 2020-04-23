/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: DateUtilTest.java 
 * @Prject: zheng-common
 * @Package: com.zheng.common.util 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年4月23日 下午6:23:15 
 * @version: V1.0   
 */
package com.zheng.common.util;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: DateUtilTest 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年4月23日 下午6:23:15  
 */
public class DateUtilTest {

	@Test
	public void test1() {
		//返回随机日期
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
		Date min=null;
		Date max=new Date();
		Date min2;
		try {
			Date random=null;
			String format=null;
			min2 = min=s.parse("2018-9-9");
			for(int i=0;i<10;i++){
				random = DateUtil.random(min2,max);
				format = s.format(random);
				System.out.println(format);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
