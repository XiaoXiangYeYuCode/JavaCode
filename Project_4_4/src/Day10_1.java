import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 74646
 * Date: 2022-05-14
 * Time: 10:56
 */
public class Day10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        int num = 0;
        int dl = 0;
        int sl = 0;
        int other = 0;
        char[] chars = str.toCharArray();
        if(chars.length<5){
            sum+=5;
        }else if(chars.length<8){
            sum+=10;
        }else if(chars.length>=8){
            sum+=25;
        }
        for (char ch:chars) {
            if(ch>='0'&&ch<='9'){
                num++;
            }else if(ch>='A'&&ch<='Z'){
                dl++;
            }else if(ch>='a'&&ch<='z'){
                sl++;
            }else{
                other++;
            }
        }
        if((dl>0&&sl==0)||(dl==0&&sl>0)){
            sum+=10;
        } else if (dl>0&&sl>0) {
            sum+=20;
        }
        if(num==1){
            sum+=10;
        }else if(num>1){
            sum+=20;
        }
        if(other==1){
            sum+=10;
        }else if(other>1){
            sum+=25;
        }
        if(num>0&&(sl>0||dl>0)&&other==0){
            sum+=2;
        }else if(num>0&&other>0&&(sl>0&&dl==0)||(sl==0&&dl>0)){
            sum+=3;
        }else if(num>0&&sl>0&&dl>0&&other>0){
            sum+=5;
        }
        if(sum>=90){
            System.out.println("VERY_SECURE");
        } else if (sum>=80) {
            System.out.println("SECURE");
        } else if (sum>=70) {
            System.out.println("VERY_STRONG");
        } else if (sum>=60) {
            System.out.println("STRONG");
        } else if (sum>=50) {
            System.out.println("AVERAGE");
        } else if (sum>=25) {
            System.out.println("WEAK");
        } else if (sum>=0) {
            System.out.println("VERY_WEAK");
        }
    }
}
