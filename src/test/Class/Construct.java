package test.Class;
import java.util.Arrays;

public class Construct {

    String heroName = "";

    int heroHp = 1;

    float heroSpeed = 10f;

    public static void main (String[] args) {

        Construct a = new Construct("盖伦", 123000, 10.1f);

        System.out.println(a.heroName);
        System.out.println(a.heroHp);
        System.out.println(a.heroSpeed);

        int[] arr = new int[10];


        a.test(arr);

        System.out.println("原数据" + Arrays.toString(arr));
    }

    public Construct(String heroName, int heroHp, float heroSpeed) {

        this.heroName = heroName;
        this.heroHp = heroHp;
        this.heroSpeed = heroSpeed;

    }

    public void test(int[] arr) {
        System.out.println("元数据：" + Arrays.toString(arr));

        arr = new int[]{};
        System.out.println("处理后" + Arrays.toString(arr));


    }

}
