package mymath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mymathtest {
	/*
	@Test
	void sqrtTest() {
		int a = 3;
		int b = 4;
		int c2 = a*a + b*b;
		int c = mymathclass.sqrt(c2);
		assert c == 5;
		assert mymathclass.sqrt(0) == 0;
		mymathclass.sqrt(-1);
	}
	
	@Test
	void binarySearchTest() {
		int[] xs = {10, 20, 30, 40};
		assertEquals(0, mymathclass.binarySearch(xs, -7));
		assertEquals(1, mymathclass.binarySearch(xs, 15));
		assertEquals(2, mymathclass.binarySearch(xs, 30));
		assertEquals(4, mymathclass.binarySearch(xs, 50));
	}
	*/
	@Test
	void inserttest() {
		int[] xs = {10, 20, 30, 5};
		int[] xs_inserted = {10, 15, 20, 30};
		mymathclass.insert(xs, 3, 15);
		assertArrayEquals(xs_inserted, xs);
	}
	
	@Test
	void insertionSorttest() {
		int[] xs = {30, 20, 40, 10};
		int[] xs_sorted = {10, 20, 30, 40};
		mymathclass.insertionSort(xs);
		assertArrayEquals(xs_sorted, xs);
	}

}