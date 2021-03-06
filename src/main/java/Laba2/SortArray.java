package Laba2;

public class SortArray {
public static int[] Sort(int[] array) {

boolean isSorted = false;
int transfer;
while(!isSorted) {
isSorted = true;
for(int i=0; i < array.length-1; i++) {
if(array[i] > array[i+1]) {
isSorted = false;
transfer = array[i];
array[i] = array[i+1];
array[i+1] = transfer;
}
}
}
return array;

}
}