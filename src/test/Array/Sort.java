package test.Array;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        Sort SortClass = new Sort();

        int[] arr = new int[]{45, 32, 34, 4, 56, 333, 3, 0};
        int[] arr1 = new int[]{45, 32, 34, 4, 56, 333, 3, 0};

        System.out.println(Arrays.toString(arr));
        SortClass.selectSort(arr);
        SortClass.bubbleSort(arr1);


        // 增强for循环 类似 for in 循环
        for (int each : arr) {
            System.out.println(each);
        }


        int[] copy1 = new int[]{1, 2, 3, 4};

        int[] copy2 = new int[]{5, 6, 7, 8};

        System.arraycopy(copy1, 0, copy2, 2, 2);


        int[][] a = new int[][]{{1,2,4}, {5,6,7}};
        System.out.println(Arrays.toString(a));

        System.out.println("copy2:" + Arrays.toString(copy2));


        String jversion=System.getProperty("java.version");
        String oName=System.getProperty("os.name");
        String user=System.getProperty("user.name");
        String home	=System.getProperty("user.home");
        System.out.println("Java 运行时环境版本："+jversion);
        System.out.println("当前操作系统是："+oName);
        System.out.println("当前用户是："+user);

        System.out.println(jversion);
        System.out.println(oName);
        System.out.println(user);
        System.out.println(home);
    }

    public void selectSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int v = arr[i];

                    arr[i] = arr[j];
                    arr[j] = v;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tem = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}
