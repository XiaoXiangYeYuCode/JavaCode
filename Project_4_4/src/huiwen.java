import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 74646
 * Date: 2022-04-19
 * Time: 16:06
 */
public class huiwen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int count = 0;
        for (int i = 0; i <= a.length(); i++) {
            StringBuilder sb = new StringBuilder(a); // 将字符串 a 放入sb中
            sb.insert(i,b); // 将字符串b插入到sb中的每个位置
            StringBuilder tmp = new StringBuilder(sb);
            //如果插入后的字符串与逆置后插入的字符串相等,那么就是回文
            if(sb.toString().equals(tmp.reverse().toString())){
                count++;
            }
        }
        System.out.println(count);
    }
}
