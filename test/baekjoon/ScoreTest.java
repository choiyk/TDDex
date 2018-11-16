package baekjoon;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScoreTest {
	private Double[] arr = {1.0, 2.0, 4.0, 8.0, 16.0};

	@Test
	public void whatIsBigNum() {
		assertEquals(16, Score.bigNum(arr), 0.000001);
	}

	@Test
	public void whatIsSum() {
		assertEquals(31, Score.sum(arr), 0.000001);
	}

	@Test
	public void whatIsAvg() {
		assertEquals(6.2, Score.avg(arr), 0.000001);
	}

	@Test
	public void whitIsUpgradeScore() {
		Object[] test = {6.25, 12.5, 25.0, 50.0, 100.0};
		assertArrayEquals(test, Score.upgradeScore(arr));
	}

	@Test
	public void WhatIsUpgradeScoresAvg() {
		assertEquals(38.75, Score.avg(Score.upgradeScore(arr)), 0.000001);
	}
}
