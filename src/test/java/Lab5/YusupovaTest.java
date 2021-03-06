package Lab5;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.Array;
import Laba2.SortArray;

public class YusupovaTest {

@BeforeClass
public static void setUpBeforeClass() throws Exception {
int [] array = {1,2,5,4,6,3};
int [] sortedArray = {1,2,3,4,5,6};
Laba2.SortArray nov = new Laba2.SortArray();
array = SortArray.Sort(array);
assertArrayEquals(array,sortedArray);
}



@Before
public void setUp() throws Exception {

}

@Test
public void test() {
int [] array = {1,2,5,4,6,3};
int [] sortedArray = {1,2,3,4,5,6};
assertArrayEquals(sortedArray,SortArray.Sort(array));
}
@AfterClass
public static void secondCheck() {
int [] array = {1,2,5,4,6,3};
int [] sortedArray = {1,2,3,4,5,6};
Laba2.SortArray nov = new Laba2.SortArray();
array = SortArray.Sort(array);
assertArrayEquals(array,sortedArray);
}
}