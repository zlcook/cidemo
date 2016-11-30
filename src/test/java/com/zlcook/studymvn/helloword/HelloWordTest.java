package com.zlcook.studymvn.helloword;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWordTest
{
	@Test
	public void testSay(){
		HelloWord helloWord = new HelloWord();
		String result = helloWord.say();
		assertEquals("hello maven",result); 
		
	}
}