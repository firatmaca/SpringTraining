package com.springboot.training.mytrainingapp;

import com.springboot.training.mytrainingapp.LearnUnitTest.LearnUnitTestMaths;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MytrainingappApplicationTests {
	LearnUnitTestMaths maths  = new LearnUnitTestMaths();

	@Test
	void calculateSum() {
		assertEquals(6, maths.calculateSum(new int[]{1,2,3}));
	}

	@Test
	void calculateSumFail() {
		assertEquals(5, maths.calculateSum(new int[]{1,2,3}));
	}

	@Test
	void calculateSumZero() {
		assertEquals(0, maths.calculateSum(new int[]{}));
	}

	@Test
	void testCase(){
		boolean t1 = true;
		boolean t2 = true;
		boolean t3 = false;
		assertEquals(t1,t2);
		assertTrue(t1);
		assertFalse(t3);
		String s1 = null;
		String s2 = "test";
		assertNotNull(s2);
		assertNull(s1);

		assertArrayEquals(new int[]{1,2},new int[]{2,1}); //false


	}
}
