package LinkedList;
import java.util.*;

public class LL{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static void display(Node val){
        Node temp = val;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(14);
        Node b = new Node(14);
        Node c = new Node(14);
        Node d = new Node(14);

        a.next = b;
        b.next = c;
        c.next = d;

        Node temp = a;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        display(a);
    }
}

