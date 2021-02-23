package com.mindtree.simple_CI_pipeline;

import org.junit.Before;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
/**
 * Unit test for simple App.
 */



//Arrange-Act-Assert pattern


public class AppTest {
private App objCalcUnderTest;

@Before
public void setUp() {
//Arrange
objCalcUnderTest = new App();
}

@Test
public void testAdd() { 
int a = 15; int b = 20; 
int expectedResult = 35;
//Act 
long result = App.add(a, b);
//Assert
Assert.assertEquals(expectedResult, result);
}

@Test
public void testSubtract() {
int a = 25; int b = 20; 
int expectedResult = 5; 
long result = App.sub(a, b);
Assert.assertEquals(expectedResult, result);
}

}