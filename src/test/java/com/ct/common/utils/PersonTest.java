package com.ct.common.utils;

import java.util.Date;


import com.ct.common.utils.RandomUtil;
import com.ct.common.utils.StringUtil;

public class PersonTest {
	public static void main(String[] args) {
		
		for (int i = 1; i < 10001; i++) {
			Person person = new Person();
			person.setName(StringUtil.generateChineseName());
			person.setAge(RandomUtil.random(1, 120));
			person.setAbout(StringUtil.randomChineseString(140));
			person.setCreated(new Date());
			System.out.println("第"+i+"位人的信息是:"+person);
		}
	}

}
