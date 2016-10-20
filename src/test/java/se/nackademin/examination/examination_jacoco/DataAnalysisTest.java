package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	@Test
	public void test1() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

	}
	
	@Test
	public void test2() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Bob", "Henriksson", "M", "14", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The first name is smaller or equals in size to the last name and the participant is 30 or younger",
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));

	}
	
	@Test
	public void test3() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Martino", "Palman", "M", "1000", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The first name is greater or equals in size to the last name and the participant older than 30",
				result.contains("The first name is greater or equals in size to the last name and the participant older than 30"));

	}
	
	@Test
	public void test4() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "1000", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The first name is greater or equals in size to the last name and the participant older than 30",
				result.contains("The first name is greater or equals in size to the last name and the participant older than 30"));

	}
	
	@Test
	public void test5() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Martin", "Palman", "M", "1000", "Lund"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The name of the homecity is small and the participant is 30 or older",
				result.contains("The name of the homecity is small and the participant is 30 or older"));

	}
	
	@Test
	public void test6() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Martin", "Palman", "M", "14", "Lund"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The name of the homecity is small and the participant is younger than 30",
				result.contains("The name of the homecity is small and the participant is younger than 30"));

	}
	
	@Test
	public void test7() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Martin", "Palman", "M", "1000", "Fortaleza"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The name of the homecity is big and the participant is 30 or older",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

	}
	
	@Test
	public void test8() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Martin", "Palman", "M", "14", "Fortaleza"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The name of the homecity is big and the participant is younger than 30",
				result.contains("The name of the homecity is big and the participant is younger than 30"));

	}


}
