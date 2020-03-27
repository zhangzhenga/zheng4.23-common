/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: CollectionUtil.java 
 * @Prject: zheng-common
 * @Package: com.zheng.common.util 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年3月26日 下午3:07:51 
 * @version: V1.0   
 */
package com.zheng.common.util;

import java.util.Collection;
import java.util.List;

/** 
 * @ClassName: CollectionUtil 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年3月26日 下午3:07:51  
 */
public class CollectionUtil {
	public static boolean test(Collection<?> collection){
		return collection!=null && !collection.isEmpty() && collection.size()>0;
	}
}
