/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: RandomUtilTest.java 
 * @Prject: zheng-common
 * @Package: com.zheng.common.util 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年3月26日 上午9:51:59 
 * @version: V1.0   
 */
package com.zheng.common.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年4月23日 下午6:20:23
 */
public class RandomUtilTest {

	/**
	 * Test method for {@link com.zheng.common.util.RandomUtil#random(int, int)}.
	 */
	@Test
	public void testRandom() {
		int random=0;
		for(int i=0;i<10;i++){
				random=RandomUtil.random(1, 3);
			System.out.println(random);
		}
		
	}

	/**
	 * Test method for {@link com.zheng.common.util.RandomUtil#subRandom(int, int, int)}.
	 */
	@Test
	public void testSubRandom() {
		int[] subRandom = RandomUtil.subRandom(1,10, 5);
		for (int i : subRandom) {
			System.out.println(i);
		}
	}

	/**
	 * Test method for {@link com.zheng.common.util.RandomUtil#randomCharacter()}.
	 */
	@Test
	public void testRandomCharacter() {
		char randomCharacter; 
		//1-9a-z随机生成一个字符
		for(int i=0;i<10;i++){
			randomCharacter=RandomUtil.randomCharacter();
			System.out.println(randomCharacter);
		}
	}

	/**
	 * Test method for {@link com.zheng.common.util.RandomUtil#randomString(int)}.
	 */
	@Test
	public void testRandomString() {
		String randomString = RandomUtil.randomString(10);
		System.out.println(randomString);
	}

}
