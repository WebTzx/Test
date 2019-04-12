package test.Array;

import java.util.Arrays;

public class ArrayApi {


    public static void main(String[] args) {

        int[] arr = new int[]{6, 12, 56, 44, 8};

        int[] copyArr = Arrays.copyOfRange(arr, 0, 5);

        String[] stringArr = {"a", "b", "f", "d"};

        System.out.println(Arrays.toString(copyArr));

//        Arrays.sort(copyArr);
        System.out.println(Arrays.toString(copyArr));

//        Arrays.sort(stringArr);
        System.out.println(Arrays.toString(stringArr));

        System.out.println("f 出现的位置" + Arrays.binarySearch(stringArr, "f"));

        System.out.println("两数组是否相等" + Arrays.equals(arr, copyArr));


        ArrayApi a = new ArrayApi();

        a.demo();
    }

    public void demo() {

        int[][] arr = new int[8][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[]{(int)(Math.random() * 100), (int)(Math.random() * 100), (int)(Math.random() * 100), (int)(Math.random() * 100), (int)(Math.random() * 100)};
            Arrays.sort(arr[i]);
            System.out.println(Arrays.toString(arr[i]));
        }

    }


}
