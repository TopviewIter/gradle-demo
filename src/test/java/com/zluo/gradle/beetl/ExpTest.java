package com.zluo.gradle.beetl;

import java.io.IOException;

import org.junit.Test;

public class ExpTest {

	@Test
	public void testCalculateExp() throws IOException{
		new Exp().calculateExp("exp.txt");
	}
	
}
