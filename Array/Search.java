package Array;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter your target : ");
        int x = sc.nextInt();
        for(int i=0; i<size; i++){
            if(x == arr[i]) {
                System.out.println("The found index is : " + i);
            }
        }
    }
}
