package com.ct.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	//计算年龄
	@Test
	public void testGetAgeByBirthday() {
		Calendar c = Calendar.getInstance();
		c.set(1997, 0, 6);
		int i = DateUtil.getAgeByBirthday(c.getTime());
		System.out.println(i);
	}

	//返回月末
	@Test
	public void testGetEndMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 6, 1);
		Date date = DateUtil.getEndMonth(c.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}

	//返回月初
	@Test
	public void testGetInitMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 5, 25);
		Date date = DateUtil.getInitMonth(c.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}

	//随机获得一个日期
	@Test
	public void testRandomDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		Date date = DateUtil.randomDate(c.getTime(), new Date());
		String string = sdf.format(date);
		System.out.println(string);
	}

}
