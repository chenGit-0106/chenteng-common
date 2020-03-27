package com.ct.common.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CollectionUtilTest {

	//有值就是false  没值就是true
	@Test
	public void testIsEmpty() {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(1);
		boolean b = CollectionUtil.isEmpty(list);
		System.out.println(b);
	}

}
