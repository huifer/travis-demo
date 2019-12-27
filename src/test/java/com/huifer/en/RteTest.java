package com.huifer.en;

import org.junit.Assert;
import org.junit.Test;

public class RteTest {

	@Test
	public void te() {
		Assert.assertEquals(false, Rte.hh(1));
	}

	@Test
	public void te2() {
		Assert.assertEquals(true, Rte.hh(0));
	}

	@Test
	public void error() {
		int i = 1 / 0;
	}
}