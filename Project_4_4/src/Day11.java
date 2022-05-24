/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 74646
 * Date: 2022-05-16
 * Time: 16:37
 */
import java.util.*;
public class Day11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // while(sc.hasNext()){
            int n= sc.nextInt();
            int m = 2*n-1;
            int[][] arr = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=0;
                }
            }
            arr[0][0]=1;
            for(int i=1;i<n;i++){
                arr[i][0] = arr[i][2*i]=1;
                for(int j=1;j<2*i;j++){
                    if(j==1){
                        arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                    }else{
                        arr[i][j]=arr[i-1][j]+arr[i-1][j-1]+arr[i-1][j-2];
                    }
                }
            }
            int k = 0;
            for(;k<m;k++){
                if(arr[n-1][k]%2==0){
                    System.out.println(k+1);
                    break;
                }
            }
            if(k==m){
                System.out.println(-1);
            }
     //   }
    }
}
