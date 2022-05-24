import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 74646
 * Date: 2022-01-22
 * Time: 18:16
 */
public class TestDemo2 {
    public static void main(String[] args) {
        double sum = 0;
        int temp = 1;
        for (int i = 1; i <= 100; i++) {
            sum += (1.0 * temp) / i;
            temp = -temp;
        }
        System.out.println(sum);
    }


    public static void main28(String[] args) {
        for (int i = 100; i < 999; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            int sum = a * a * a + b * b * b + c * c * c;
            if (i == sum) {
                System.out.println(i);
            }
        }
    }


    public static void main27(String[] args) {
        Random random = new Random();
        int ran = random.nextInt(100);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num > ran) {
                System.out.println("猜大了");
            } else if (num < ran) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }



    }
    public static void main26(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 19) {
            System.out.println("少年");
        } else if (num < 29) {
            System.out.println("青年");
        } else if (num < 56) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
    }


    public static void main25(String[] args) {
        int j = 0;
        for (int i = 1; i < 100; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(i + " ");
            }
        }
    }


    public static void main24(String[] args) {
        for (int year = 1000; year <= 2000; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year);
            }
        }
    }


    public static void main23(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            //判断个位
            if (i % 10 == 9) {
                count++;
            }
            //判断十位
            if (i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }



    public static void main22(String[] args) {
        int ret = 1;
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            ret*=i;
            sum+=ret;
        }
        System.out.println(sum);
    }
    public static void main21(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }


    public static void main20(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int temp = 1;
            for (int j = 1; j <= i; j++) {
                temp *= j;
            }
            sum += temp;
        }
        System.out.println(sum);
    }


    public static void main19(String[] args) {
        int i = 1;
        while (i<=100){
            if(i%15!=0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    public static void main18(String[] args) {
        int i = 1;
        while (i<=100){
            if(i%3!=0 || i%5!=0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
    public static void main17(String[] args) {
        int i = 1;
        while (i<=100){
            if(i%3==0 && i %5==0){
                System.out.println(i);
                i++;
                continue;
            }
            i++;
        }
    }

    public static void main16(String[] args) {
        int j = 1;
        int sum = 0;
        while (j <= 5) {
            int i = 1;
            int ret = 1;
            while (i <= j) {
                ret *= i;
                i++;
            }
            sum += ret;
            j++;
        }
        System.out.println(sum);
    }


    public static void main15(String[] args) {
        int i = 100;
        while (i <= 200) {
            if (i % 3 != 0) {
                i++;
                continue;
            }
            System.out.println("3的倍数" + i);
            i++;
        }
    }


    public static void main14(String[] args) {
        int num = 1;
        while (num <= 10) ;
        {
            System.out.println(num);
            num++;
        }
    }



    public static void main13(String[] args) {
        int i = 1;
        int temp = 1;
        while (i <= 5) {
            temp *= i;
            i++;
        }
        System.out.println(temp);
    }


    public static void main12(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }


    public static void main11(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void main10(String[] args) {
        String str = "hello";
        switch (str) {
            case "abc":
                System.out.println(1);
                break;
            case "hello":
                System.out.println(2);
                break;
            default:
                System.out.println("错误");
        }
    }

public static void main9(String[] args) {
        int x = 1;
        int y = 1;
        switch (x) {
            case 1:
                switch (y) {
                    case 1:
                        System.out.println("hehe");
                        break;
                }
                break;
            case 2:
                System.out.println("haha");
                break;
        }
    }


    public static void main8(String[] args) {
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }


    public static void main7(String[] args) {
        int x = 20;
        if (x == 10) ; {
            System.out.println("hehe");
        }
    }

    public static void main6(String[] args) {
        int year = 2000;
        if (year % 100 == 0) {
            //判断世纪闰年
            if (year % 400 == 0) {
                System.out.println(year + "是世纪闰年");
            } else {
                System.out.println(year + "不是闰年");
            }
        } else {
            if (year % 4 == 0) {
                //判断普通闰年
                System.out.println(year + "是普通闰年");
            } else {
                System.out.println(year + "不是闰年");
            }
        }
    }

    public static void main5(String[] args) {
        int year = 2022;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }

    public static void main4(String[] args) {
        int num = -10;
        if (num > 0) {
            System.out.println("num 是正数");
        } else if (num < 0) {
            System.out.println("num 是负数");
        } else {
            System.out.println("num 是0");
        }
    }

    public static void main3(String[] args) {
        Scanner input = new Scanner(System.in); //alt + 回车
        //String str = input.next(); //遇到空格读取结束
        String str = input.nextLine(); //会读取空格
        System.out.println(str);
        int num = input.nextInt();
        if (0 == num % 2) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
    public static void main2(String[] args) {
        int num = 10;
        if (0 == num % 2) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }

    public static void main1(String[] args) {
        System.out.println("hello");
        System.out.println("world");
        System.out.println("Java");
    }
}
