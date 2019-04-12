package test.Class;

public class GiantDragon {

    String name = "sdfas";


    private GiantDragon() {

    }

    private static GiantDragon instance = new GiantDragon();

    public static GiantDragon g() {

        return instance;
    }


    public static void main() {

    }

    /**
     * 1. 构造方法私有化
     * 2. 静态属性指向实例
     * 3. public static getInstance 方法返回实例
     * **/


}
