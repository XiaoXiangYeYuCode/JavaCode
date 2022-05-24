import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 74646
 * Date: 2022-04-04
 * Time: 10:10
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int count = 0;
        long sum = 0;
        long mul = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum+=array[i];
            mul *=array[i];
        }
        for (int i = 0; i < n; i++) {
            if(sum>mul){
                count++;
            }else {
                n--;
                if(sum>mul){
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] s = new String[3];
        int[] arr = new int[3];
        for (int i = 0; i < str.length(); i++) {
            s = str.split(" ");
        }
        int year = Integer.parseInt(s[0]);
        int month =  Integer.parseInt(s[1]);
        int day =  Integer.parseInt(s[2]);
//        int year = scanner.nextInt();
//        int month = scanner.nextInt();
//        int day = scanner.nextInt();
        int[] m = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int leap = 0;
        if((year%4==0&&year%100!=0)|| year%400==0){
            leap = 1;
        }
        m[2]+=leap;
        day+=m[0];
        for (int i = 0; i < month; i++) {
            day+=m[i];
        }
        System.out.println(day);
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<str2.length();i++){
           if(map.get(str2.charAt(i))==null){
               map.put(str2.charAt(i),1);
           }else{
               int val = map.get(str2.charAt(i));
               map.put(str2.charAt(i),val+1);
           }
           //map.put(str2.charAt(i),map.getOrDefault(str2.charAt(i),1)+1);
        }
        String ret = "";
        for (int i = 0; i < str1.length(); i++) {
            if(map.get(str1.charAt(i))==null){
                ret+=str1.charAt(i);
            }
        }
        System.out.println(ret);
    }
}
