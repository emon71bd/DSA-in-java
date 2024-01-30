package LabTask;
import java.util.*;
public class binarySearch {
    public static void BinarySearch(int[] a, int st, int end, int k){
        while(st <= end){
            int mid = (st+end)/2;
           if(k == a[mid]){
               System.out.println("The target indices is : "+mid);
               break;
           } else if(a[mid]<k){
               st = mid+1;
           }else if(a[mid]> k){
               end = mid-1;
           }
        }
        if(st>end){
            System.out.println("Not found.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5,6,7,8,9};
        int n = a.length;
        int st = 0, end = n-1;
        int key = 71;
        BinarySearch(a,st,end,key);
    }
}
