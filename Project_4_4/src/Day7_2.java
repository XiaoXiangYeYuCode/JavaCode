import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 74646
 * Date: 2022-05-01
 * Time: 13:47
 */
public class Day7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1=0;
        int f2=1;
        while (n<f2){
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        int min = Math.min(n-f1,f2-n);
        System.out.println(min);
    }

}
