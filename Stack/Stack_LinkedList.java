package Stack;
public class Stack_LinkedList {
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static  class stack{
        public static Node head = null;


        //isEmpty??
        public static boolean isEmpty(){
            return head==null;
        }



        //push
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }




        //pop 
        public static int  pop(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }



        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            return top.data;
        }

        }


        public static void main(String args[]){
            stack sh = new stack();
            sh.push(1);
            sh.push(2);
            sh.push(3);
            sh.push(4);


            while(!sh.isEmpty()){
                System.out.println(stack.peek());
                stack.pop();

            }
        }
}
