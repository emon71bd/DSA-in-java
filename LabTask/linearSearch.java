package LabTask;
import java.util.*;
public class linearSearch {
    public static void LinearSearch(int[] x, int s, int k){
        int i = 0;

        for(i=0; i<s; i++){
            if(k==x[i]){
                System.out.println("Element found at indices in : "+i);
                break;
            }
        }
        if(i == s){
            System.out.println("Element not found in the given array.");
        }
    }
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int size = o.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array elements : ");
        for(int i=0; i<size; i++){
            a[i]= o.nextInt();
        }
        System.out.println("Enter target : ");
        int key = o.nextInt();
        LinearSearch(a,size,key);
    }
}
