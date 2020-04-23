/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: StringUtilTest.java 
 * @Prject: zheng2-common
 * @Package: com.zheng.util 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年3月29日 下午6:06:01 
 * @version: V1.0   
 */
package com.zheng.common.util;

import org.junit.Test;


public class StringUtilTest {
	@Test
	public void test1() {
		//判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
		boolean hasLength = StringUtil.hasLength("");
		System.out.println(hasLength);
		 boolean hasLength2 = StringUtil.hasLength("a");
		 System.out.println(hasLength2);
	}
	@Test
	public void test2() {
		//判断源字符串	空格也算没值 (5分)
		boolean hasLength = StringUtil.hasText("  ");
		System.out.println(hasLength);
		 boolean hasLength2 = StringUtil.hasText("a");
		 System.out.println(hasLength2);
	}
	@Test
	public void test3() {
		//返回参数1个中文汉字字符串，字符集必须在GB2312
		String s = "00";
		for(int i=0;i<10;i++){
			s=StringUtil.randomChineseString();
			System.out.println(s);
		}
	}
	@Test
	public void test4() {
		//回参数length个中文汉字字符串，字符集必须在GB2312
		String randomChineseString = StringUtil.randomChineseString(100);
		System.out.println(randomChineseString);
	}
	@Test
	public void test5() {
		//返回中文姓名
		String s = "00";
		for(int i=0;i<10;i++){
			s=StringUtil.generateChineseName();
			System.out.println(s);
		}
	}
	

	
}
