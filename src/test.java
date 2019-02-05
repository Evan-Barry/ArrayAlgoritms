import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int size;
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 634;
        array[2] = 99;
        System.out.println(Arrays.toString(array));
        size = MyArray.insert(array, 3, 1, 5);
        System.out.println(size);
        System.out.println(Arrays.toString(array));
    }
}
