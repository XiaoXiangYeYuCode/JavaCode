/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 74646
 * Date: 2022-04-22
 * Time: 13:42
 */
public class StoI {
    public static int StrToInt(String str) {
        char[] chs = str.toCharArray();
        if(chs==null||chs.length==0){
            return 0;
        }
        int sum = 0;
        int flag = 1;
        if(chs[0]=='-'){
            flag=-1;
            chs[0] = '0';
        }
        if(chs[0]=='+'){
            flag=1;
            chs[0] = '0';
        }
        for(int i=0;i<chs.length;i++){
            if(chs[i]<'0'||chs[i]>'9'){
                sum = 0;
                break;
            }
            sum = sum*10+chs[i]-'0';
        }
        return flag*sum;
    }

    public static void main(String[] args) {
        String s = "123";
        int ret = StrToInt(s);
        System.out.println(ret);
    }
}
