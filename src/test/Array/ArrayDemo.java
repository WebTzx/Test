package test.Array;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = (int)(Math.random() * 100);
        a[1] = (int)(Math.random() * 100);
        a[2] = (int)(Math.random() * 100);
        a[3] = (int)(Math.random() * 100);
        a[4] = (int)(Math.random() * 100);


        // for
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            max = a[i] > max ? max : a[i];
        }

        System.out.println("最小值为：" + max);

        System.out.println("原数组为：" + Arrays.toString(a));


        ArrayDemo arr = new ArrayDemo();

        arr.reverse(a);

        // sort
//        Arrays.sort(a);
//
//        System.out.println("最小值为" + a[0]);

    }

    public void reverse(int[] arr) {

        System.out.println("原始数组为：" + Arrays.toString(arr));

//        for (int i = 0; i < Math.ceil(arr.length / 2); i++) {
//            int a = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = a;
//
//        }


        System.out.println("翻转后为:   " + Arrays.toString(arr));
    }
}
