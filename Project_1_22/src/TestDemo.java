/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 74646
 * Date: 2022-01-22
 * Time: 10:25
 */

//    public  static int function(int x){
//        return x+10;
//    }
//    public static void main(String[] args) {
//        int q = 8;
//        for (int i = 0; i < 10; i++) {
//            int ret = function(i);
//            System.out.println(ret);
//        }
public class TestDemo {
    int value = 10; //成员变量

    public static void main1(String[] args) {

        System.out.println(Short.MIN_VALUE); //最小值
        System.out.println(Short.MAX_VALUE); //最大值
    }
    public static void main2(String[] args) {
        boolean flag1 = true;
        System.out.println(flag1);
        boolean flag2 = false;
        System.out.println(flag2);
    }
    public static void main3(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b+"hello");
        System.out.println("hello"+(a+b));
        System.out.println(a+""+b+"hello");
    }
    public static void main4(String[] args) {

        {
            int a = 10;
            // System.out.println(a);
        }
       // System.out.println(a);
    }
    public static void main5(String[] args) {
        final  int SIZE ;
        SIZE = 100;//编译出错。 提示:无法为最终变量SIZE分配值
    }
    public static void main6(String[] args) {
//        int a = 10;
//        long b = 20;
//        a = b; // 编译出错, 提示可能会损失精度.
//        b = a; // 编译通过.
//
//        int a = 10;
//        double b = 1.0;
//        a = b; // 编译出错, 提示可能会损失精度.
//        b = a; // 编译通过
    }
    public static void main7(String[] args) {
        int a = 10;
        double b = 1.0;
       // a = b; // 编译出错, 提示可能会损失精度.
        b = a; // 编译通过
    }
    public static void main8(String[] args) {
        int a = 10;
        boolean b = true;
       // b = a; // 编译出错, 提示不兼容的类型
       // a = b; // 编译出错, 提示不兼容的类型
    }
    public static void main9(String[] args) {
        byte a = 100; // 编译通过
       // byte b = 256; // 编译报错, 提示 从int转换到byte可能会有损失
    }
    public static void main10(String[] args) {
        int a = 0;
        double b = 10.5;
        a = (int)b; //编译通过
        int c = 10;
        boolean d = false;
       // c = (boolean)d; // 编译出错, 提示不兼容的类型
    }
    public static void main11(String[] args) {
        int a = 10;
        long b = 20;
       // int c = a + b; // 编译出错, 提示将 long 转成 int 会丢失精度
        long d = a + b; // 编译通过.
    }
    public static void main12(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);
        System.out.println(c);
    }
    public static void main13(String[] args) {
        byte c = 10 +20;
        System.out.println(c);
    }
    public static void main14(String[] args) {
        int a = 10;
        long b = 20;
        int c = (int)(a + b);
        long d = a + b;
    }
    public static void main15(String[] args) {
        int num = 10;
        String str1 = num+"";
        String str2 = String.valueOf(num);
        System.out.println(str1);
        System.out.println(str2);
    }
    public static void main16(String[] args) {
        String num = "123";
        int ret = Integer.valueOf(num);
        System.out.println(ret+1);
    }
    public static void main17(String[] args) {

        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }
    public static void main18(String[] args) {
        System.out.println(-10%3);
        System.out.println(10%-3);
        System.out.println(-10%-3);
        System.out.println(13.5%3);
    }
    public static void main19(String[] args) {
        short  a = 20;
        a+=1; //a = a + 1;
        System.out.println(a);
    }
    public static void main20(String[] args) {
        int a = 10;
        int i1 = --a; //a = a-1;  i1 = a;
        System.out.println(a);
        System.out.println(i1);
    }
    public static void main21(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == b); //false
        System.out.println(a != b); //true
        System.out.println(a < b); //true
        System.out.println(a > b); //false
        System.out.println(a <= b); //true
        System.out.println(a >= b); //false
    }
    public static void main22(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(!(a < b)); //false
        System.out.println(!!(a < b)); //true
        // System.out.println(!a < b); //error 逻辑操作符的表达式必须是布尔表达式
    }
    public static void main23(String[] args) {
        //不支持短路
        System.out.println(10 > 20 & 10 / 0 == 0); // 程序抛出异常
        System.out.println(10 < 20 | 10 / 0 == 0); // 程序抛出异常
    }
    public static void main24(String[] args) {
        int a = 0xf;
        System.out.printf("%x\n", ~a);
    }
    public static void main25(String[] args) {
        int a = 3;
        int b = -5;
        int c = a|b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        // 求两个整数的最大值
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println(max);
    }
}
