package com.huifer.en;

import org.junit.Assert;
import org.junit.Test;

public class RteTest {

	@Test
	public void te() {
		Assert.assertTrue(Rte.hh(1));
	}

	@Test
	public void te2() {
		Assert.assertFalse(Rte.hh(0));
	}

//	@Test
//	public void error() {
//		int i = 1 / 0;
//	}
}