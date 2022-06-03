package com.nexsoft.sortingtest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.nexsoft.sorting.CSorting;

public class SortingFunctionTest {

	CSorting csort = new CSorting();

	@DisplayName("Test Bubble Sorting Function")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testCSorting_BubbleSort_ValuedIn(int a, int b, int c, int d, int e) {
		assertTimeout(Duration.ofMillis(500), () -> {
			// arrange
			int angka[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };
			// act
			Arrays.sort(expected);
			csort.bubbleSort(angka, angka.length);
			// assert
			assertArrayEquals(expected, angka);
		});

	}

	@DisplayName("Test Selection Sorting Function")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testCSorting_selectionSort_ValuedIn(int a, int b, int c, int d, int e) {
		assertTimeout(Duration.ofMillis(500), () -> {
			// arrange
			int angka[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };
			// act
			Arrays.sort(expected);
			csort.selectionSort(angka);
			// assert
			assertArrayEquals(expected, angka);
		});
	}

	@DisplayName("Test Insertion Sorting Function")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testCSorting_insertionSort_ValuedIn(int a, int b, int c, int d, int e) {
		assertTimeout(Duration.ofMillis(500), () -> {
			// arrange
			int angka[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };
			// act
			Arrays.sort(expected);
			csort.insertionSort(angka, angka.length);
			// assert
			assertArrayEquals(expected, angka);
		});
	}
	
	@DisplayName("Test Bubble Sorting Function Short Variable")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testCSorting_BubbleSort_ValuedShort(int a, int b, int c, int d) {
		assertTimeout(Duration.ofMillis(500), () -> {
			// arrange
			int angka[] = { a, b, c, d};
			int expected[] = { a, b, c, d };
			// act
			Arrays.sort(expected);
			csort.bubbleSort(angka, angka.length);
			// assert
			assertArrayEquals(expected, angka);
		});

	}

	@DisplayName("Test Selection Sorting Function Short Variable")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testCSorting_selectionSort_ValuedShort(int a, int b, int c, int d) {
		assertTimeout(Duration.ofMillis(500), () -> {
			// arrange
			int angka[] = { a, b, c, d };
			int expected[] = { a, b, c, d};
			// act
			Arrays.sort(expected);
			csort.selectionSort(angka);
			// assert
			assertArrayEquals(expected, angka);
		});
	}

	@DisplayName("Test Insertion Sorting Function Short Variable")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testCSorting_insertionSort_ValuedShort(int a, int b, int c, int d) {
		assertTimeout(Duration.ofMillis(500), () -> {
			// arrange
			int angka[] = { a, b, c, d };
			int expected[] = { a, b, c, d};
			// act
			Arrays.sort(expected);
			csort.insertionSort(angka, angka.length);
			// assert
			assertArrayEquals(expected, angka);
		});
	}

}
