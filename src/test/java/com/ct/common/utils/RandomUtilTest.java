package com.ct.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	//返回一个随机的整数
	@Test
	public void testRandom() {
		int i = RandomUtil.random(1, 3);
		System.out.println(i);
	}

	//返回一个随机整数的数组
	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1, 10, 5);
		for (int i : is) {
			System.out.println(i);
		}
	}

	//返回一个字符/数字
	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	//返回指定长度的字符/数字
	@Test
	public void testRandomString() {
		String randomString = RandomUtil.randomString(5);
		System.out.println(randomString);
	}

}
