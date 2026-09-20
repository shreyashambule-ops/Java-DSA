package Stack;
import java.util.*;



public class Stack_ArrayList {
     static ArrayList<Integer> list = new ArrayList<>();



    //isempty??
    public static boolean isEmpty(){
        return list.size() == 0;

    }


    //push
    public static void push(int data){
        list.add(data);

    }


    //pop
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }


    //peek
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
        
    }


    public static void main(String args[]){
        Stack_ArrayList sh= new Stack_ArrayList();

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
