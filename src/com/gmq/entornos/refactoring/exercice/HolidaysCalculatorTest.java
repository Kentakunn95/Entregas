package com.gmq.entornos.refactoring.exercice;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class HolidaysCalculatorTest {

	HolidaysCalculator[] HolidaysCalculator = new HolidaysCalculator[0];
	HolidaysCalculator HolidaysCalculator1 = new HolidaysCalculator("name");
	HolidaysCalculator HolidaysCalculator2 = new HolidaysCalculator("name", 5);
	HolidaysCalculator HolidaysCalculator3 = new HolidaysCalculator(3);
	HolidaysCalculator HolidaysCalculator4 = new HolidaysCalculator(3);

	@BeforeEach
	public void setUp() {
		HolidaysCalculator3.getName();
		HolidaysCalculator1.getNumberOfChildren();
		HolidaysCalculator2.calculateHolidaysDays(2020, 3);
		HolidaysCalculator4.calculateHolidaysDays(0, 8);
	}
 
	@After 
	public void tearDown() { 
	} 

	@ParameterizedTest
	@MethodSource("calcularVacaciones")
	void calculateHolidaysDays(int year, int numberOfChildren, int result) {

		assertEquals(result, HolidaysCalculator.length);
	}

	static Stream<Arguments> calcularVacaciones() {
		return Stream.of(Arguments.of(2020, 2, 25), Arguments.of(2017, 4, 26), Arguments.of(2018, 0, 22));
	}

}
