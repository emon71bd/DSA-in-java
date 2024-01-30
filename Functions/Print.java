package Functions;
import java.util.Scanner;

public class Print {
    public static int add(int x, int y) {
        int sum = x+y;
        return sum;
    }
    public static int calculateMulti(int p, int q){
        int multi = p*q;
        return multi;
    }
    public static void printFactorial(int n){
        int factorial = 1;
        for(int i=n; i>=1; i--){

            System.out.println(factorial);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
//        String name = sc.next();
        int sum = add(a,b);
        System.out.println("Sum of two number is : " +sum);

        int Multi = calculateMulti(a,b);
        System.out.println("Multiply of two number is : " +Multi);

        Scanner fac = new Scanner(System.in);
        System.out.println("Enter n number : ");
        int n = fac.nextInt();
        printFactorial(n);
    }
}
