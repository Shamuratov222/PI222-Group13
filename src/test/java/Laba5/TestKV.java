package Laba5;

import static org.junit.Assert.*;

import org.junit.BeforeClass;

import Laba2.Array;

public class TestKV {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	Laba2.Array ahh = new Laba2.Array();
	int[] arrayCheck = Array.getArray();
	int[] arrayResult = new int [6];
	assertEquals(arrayCheck.length, arrayResult.length);
	}


	@BeforeClass
	public static void setUp() {
	Laba2.Array arrayMaker = new Laba2.Array();
	int[] arrayCheck = Array.getArray();
	for(int i=0; i < arrayCheck.length; i++) {
	assertNotNull(("Нулевой элемент: " + i), arrayCheck[i]);
	}

	}
	}