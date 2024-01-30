package LinkedList;

public class implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){ // empty list
                head = tail = temp; // head = temp // tail = temp
            }
            else{ // non empty list
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4); // 4
        ll.display();
        System.out.println();
        ll.insertAtEnd(5); // 4 5
        ll.display();
        System.out.println();
        ll.insertAtEnd(12);
        ll.display();
        System.out.println();

        System.out.println("length is : " +ll.size());

        // insert at head
        ll.insertAtHead(13);
        ll.display();
        System.out.println();

        ll.insertAt(2,28);
        ll.display();
    }
}
