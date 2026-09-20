package Stack;
import java.util.*;



public class Stack_Collecction {
    
    public static void main(String args[]){
        Stack<Integer> sh =new Stack<>();

        sh.push(1);
        sh.push(2);
        sh.push(3);
        sh.push(4);

        while(!sh.isEmpty()){
                System.out.println(sh.peek());
                sh.pop();
            }
    }
 
}
