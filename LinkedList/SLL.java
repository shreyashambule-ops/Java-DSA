package LinkedList;

public class SLL {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data  =data;
            this.next = null;
        }
    }


    // Add first

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;

    }


    //Add last

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    

    //print the list

    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    //delete first

    public void deleteFirst(){
        if(head ==null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    
    //delete last

    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
       Node secondLast= head;
       Node lastNode = head.next;

       while(lastNode!=null){
        lastNode = lastNode.next;
        secondLast = secondLast.next;
       }
       secondLast.next=null;
    }


    //reverseing the list using iteration

    public void reverseIterate(){
        if(head ==null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;

    }


    //reversing linkedlist using recirsive approach
    public Node reverseRecursive(Node head){
         if(head==null || head.next==null) return head;

        Node newHead =reverseRecursive(head.next);
        head.next.next = head;
        head.next=null;
        return newHead;
    }
    
    


    public static void main(String[] args){
        SLL list = new SLL();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.printList();
        
        list.head = list.reverseRecursive(list.head);
        list.printList();


       


    }
    
}
