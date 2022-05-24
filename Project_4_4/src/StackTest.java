import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 74646
 * Date: 2022-05-11
 * Time: 8:58
 */

class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack1.isEmpty()){
            return -1;
        }
        if(!stack1.isEmpty() && stack2.isEmpty()){
            int size = stack1.size();
            int val = -1;
            for(int i=0;i<size;i++){
                val = stack1.pop();
                stack2.push(val);
            }
        }
        return stack2.pop();
    }
}
public class StackTest {
    public static void main(String[] args){
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        cQueue.deleteHead();
        cQueue.deleteHead();
    }
}
