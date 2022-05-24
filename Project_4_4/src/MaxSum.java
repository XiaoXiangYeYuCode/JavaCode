import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 74646
 * Date: 2022-04-20
 * Time: 8:16
 */
public class MaxSum {
    //状态方程式： max( dp[ i ] ) = getMax( max( dp[ i -1 ] ) + arr[ i ] ,arr[ i ] )
    public static int Max(int x,int y){
        return Math.max(x, y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            // 比较两个数相加后的值与当前元素值的大小
            sum = Max(sum+array[i],array[i]);
            // 如果和大于当前最大值,就将和赋给最大值
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
