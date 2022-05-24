import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 74646
 * Date: 2022-04-30
 * Time: 17:59
 */
public class Day7 {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        char[] chs = A.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(chs[i]=='('){
                stack.push(chs[i]);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if(top=='('&&chs[i]==')'){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

    }
}
