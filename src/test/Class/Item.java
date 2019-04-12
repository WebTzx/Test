package test.Class;

public class Item {
    String name = "default";

    int price = 10; // 同一个包下可以继承、访问

    protected String flag = ""; //

    private String password = "123456"; // 私有，只有本身能访问

    static String createUser = "TZX"; // 所有子类和本身共享的属性, 可以修改

    static void GetUser() { // 类方法， 不必实例化就可以调用

        System.out.println("当前创建人为： TZX" );
    }

//    Item(String name, int price) {
//
//        this.name = name;
//
//        this.price = price;
//
//        System.out.println(this.name + "的价格为："  + this.price);
//
//    }

    public static void main(String[]  args) {

        System.out.println("私有属性 password: " + new Item().password);
    }

}
