package com.nexsoft.sortingtest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.nexsoft.sorting.CSorting;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SortingFunctionTest {

	CSorting csort = new CSorting();
	
	@Order(1)
	@DisplayName("Test Bubble Sorting Function")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter=',',numLinesToSkip = 1)
	public void testCSorting_BubbleSort_ValuedIn(String inString) {
		assertTimeout(Duration.ofMillis(500), () -> {
			// arrange
			String arrString[] = inString.split(",");
			int panjangArr = arrString.length;
			int arrResult[] = new int[arrString.length];
			int arrExpected[] = new int[arrString.length];
			//act
			for (int i = 0; i < 5; i++) {
				panjangArr--;
				if (panjangArr < 0) {
					break;
				} else {
					arrExpected[i] = Integer.parseInt(arrString[i]);
					arrResult[i] = Integer.parseInt(arrString[i]);
				}
			}
			csort.bubbleSort(arrResult, arrString.length);
			Arrays.sort(arrExpected);
			// assert
			assertArrayEquals(arrExpected, arrResult);
		});
	}
	
	@Order(2)
	@DisplayName("Test Selection Sorting Function")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testCSorting_selectionSort_ValuedIn(String inString) {
		assertTimeout(Duration.ofMillis(500), () -> {
			// arrange
						String arrString[] = inString.split(",");
						int panjangArr = arrString.length;
						int arrResult[] = new int[arrString.length];
						int arrExpected[] = new int[arrString.length];
						//act
						for (int i = 0; i < 5; i++) {
							panjangArr--;
							if (panjangArr < 0) {
								break;
							} else {
								arrExpected[i] = Integer.parseInt(arrString[i]);
								arrResult[i] = Integer.parseInt(arrString[i]);
							}
						}
						csort.selectionSort(arrResult);
						Arrays.sort(arrExpected);
						// assert
						assertArrayEquals(arrExpected, arrResult);
		});
	}
	
	@Disabled
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
			int angka[] = { a, b, c, d };
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
			int expected[] = { a, b, c, d };
			// act
			Arrays.sort(expected);
			csort.selectionSort(angka);
			// assert
			assertArrayEquals(expected, angka);
		});
	}

	@DisplayName("Test Insertion Sorting Function Short Variable")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ',', numLinesToSkip = 1)
	public void testCSorting_insertionSort_ValuedShort(int a, int b, int c, int d) {
		assertTimeout(Duration.ofMillis(500), () -> {
			// arrange
			int angka[] = { a, b, c, d };
			int expected[] = { a, b, c, d };
			// act
			Arrays.sort(expected);
			csort.insertionSort(angka, angka.length);
			// assert
			assertArrayEquals(expected, angka);
		});
	}

	@DisplayName("Test String")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testString(String inString) {
		assertTimeout(Duration.ofMillis(500), () -> {
			// arrange
			String arrString[] = inString.split(";");
	        int arrResult[] = new int[arrString.length];
	        int arrExpected[] = new int[arrString.length];
	        
	        //act
			for (int i = 0; i < arrString.length; i++) {
				arrExpected[i] = Integer.parseInt(arrString[i]);
				arrResult[i] = Integer.parseInt(arrString[i]);
			}
			csort.bubbleSort(arrResult, arrString.length);
			Arrays.sort(arrExpected);

	        //assert
	        assertArrayEquals(arrExpected, arrResult);
		});
	}
}
