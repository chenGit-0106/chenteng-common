package com.ct.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		//String str = "ads";
		String str = " ";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str = " ";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(100);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}
