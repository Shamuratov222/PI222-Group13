package Laba2;

public class Array {
public static int[] getArray() {
int[] array = new int[6];
NumberGenerator Generator1 = new NumberGenerator();
for(int i=0; i < array.length; i++) {
array[i] = NumberGenerator.Number();

}

return array;
}
}