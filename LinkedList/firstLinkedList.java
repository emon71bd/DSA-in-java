package LinkedList;
import java.util.*;
public class firstLinkedList {
    public static void displayr2(Node head) {
        if(head == null) return;
        display(head.next);
        System.out.print(head.data + " ");
    }
    public static void displayr(Node head) {
        if(head == null) return;
        System.out.print(head.data + " ");
        display(head.next);
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
//        System.out.println(a.next); //Null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3 9 8 16

        a.next = b; // 5 -> 3  9  8  16
        b.next = c; // 5 -> 3 -> 9  8  16
        c.next = d; // 5 -> 3 -> 9 -> 8 16
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 16

        display(a);
        System.out.println();
        displayr2(a); // this function will reverse the given values
        System.out.println();
        displayr(a);


//        Node temp = a;
//        // printing the list
//        while(temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
        }
//        for(int i=1; i<=5; i++){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }


//        System.out.println(a); // $Node@5f184fc6
//        System.out.println(a.next); //$Node@3feba861
//        System.out.println(b); // $Node@3feba861
//        System.out.println(c); // Node@5b480cf9
}

