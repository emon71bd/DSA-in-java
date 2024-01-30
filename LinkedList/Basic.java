package LinkedList;
import java.util.*;

public class Basic {
    public static void length(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        System.out.print("Length is : " +count);
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void displayA(Node head){
            while(head != null){
                System.out.print(head.data + " ");
                head = head.next;
            }
    }
    public static void displayr(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        displayr(head.next);
    }
    public static void displayReverse(Node head){
        if(head == null) return;
        displayReverse(head.next);
        System.out.print(head.data + " ");
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(9);
        Node c = new Node(3);
        Node d = new Node(10);
        Node e = new Node(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Printing Linked List
        display(a);
        System.out.println();

        // length of Linked List
        length(a);
        System.out.println();

        // display reverse order
        displayReverse(a);
        System.out.println();

        // display using a(head)
        displayA(a);
        System.out.println();

        // Display ar recursively
        displayr(a);

        // displaying LinkedList...
//        Node temp = a;
//        System.out.println(temp.data);
//        while(temp != null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }


//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

    }
}
