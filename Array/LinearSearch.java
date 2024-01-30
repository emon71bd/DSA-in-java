package Array;
import java.util.*;
public class LinearSearch {
    public static void BinarySearch(int[] a, int n, int key){

        int first = 0;
        int last = n;

        while(first<=last){

            int mid = (first+last)/2;
            if(a[mid] == key){
                System.out.println("Element found at index : " +mid);
                return;
            }
            else if(a[mid]<key){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
            if(first>last){
                System.out.println("Not found");
            }
        }
    }
     
    public static void main(String[] args) {
        int[] a = {1,2,3,45,55};
        int n = a.length-1;
        int key = 2;
        BinarySearch(a,n,key);
    }
}
