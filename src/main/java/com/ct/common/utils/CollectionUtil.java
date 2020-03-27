package com.ct.common.utils;

import java.util.Collection;

/**
 * 
 * @ClassName: CollectionUtil 
 * @Description: 集合工具类
 * @author: 陈腾
 * @date: 2020年3月26日 下午4:40:03
 */
public class CollectionUtil {
	//判断集合是否有值
	public static boolean isEmpty(Collection<?> collection) {
		
		return  collection==null || collection.isEmpty();
		
	}
}
