package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class AbstractPalladium2020Test {
	abstract Palladium2020Interface getTestObject();

	@Test
	void test01() {
		int[] H = new int[] { 3, 1, 4 };
		int a = 10;

		assertEquals(a, getTestObject().solution(H));
	}

	@Test
	void test02() {
		int[] H = new int[] { 5, 3, 2, 4 };
		int a = 17;

		assertEquals(a, getTestObject().solution(H));
	}

	@Test
	void test03() {
		int[] H = new int[] { 5, 3, 5, 2, 1 };
		int a = 19;

		assertEquals(a, getTestObject().solution(H));
	}

	@Test
	void test04() {
		int[] H = new int[] { 7, 7, 3, 7, 7 };
		int a = 35;

		assertEquals(a, getTestObject().solution(H));
	}

	@Test
	void test05() {
		int[] H = new int[] { 1, 1, 7, 6, 6, 6 };
		int a = 30;

		assertEquals(a, getTestObject().solution(H));
	}

	@Test
	@DisplayName("Pyramid")
	void test06() {
		int[] H = new int[] { 1, 2, 3, 2, 1 };
		int a = 13;

		assertEquals(a, getTestObject().solution(H));
	}

	@Test
	void test07() {
		int[] H = new int[] { 1, 4, 2, 4, 1 };
		int a = 17;

		assertEquals(a, getTestObject().solution(H));
	}

	@Test
	void test08() {
		int[] H = new int[] { 1, 2, 3, 2, 4, 1 };
		int a = 20;

		assertEquals(a, getTestObject().solution(H));
	}

	@Test
	void test09() {
		int[] H = new int[] { 2, 3, 4, 2, 1, 2 };
		int a = 18;

		assertEquals(a, getTestObject().solution(H));
	}

	@Test
	void test10() {
		int[] H = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int a = 10;

		assertEquals(a, getTestObject().solution(H));
	}

	@Test
	@DisplayName("Ascending")
	void test11() {
		int[] H = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int a = 61;

		assertEquals(a, getTestObject().solution(H));
	}

	@Test
	@DisplayName("Descending")
	void test12() {
		int[] H = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int a = 61;

		assertEquals(a, getTestObject().solution(H));
	}

	@Test
	@DisplayName("Valley")
	void test13() {
		int[] H = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int a = 153;

		assertEquals(a, getTestObject().solution(H));
	}
}
