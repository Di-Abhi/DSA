// Using Dynamic Programming
import java.util.Scanner;

public class fibbonacci {
    public static int fib(int n,int[] qb){
        if(n==0||n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        System.out.println("Hello "+n);
        int fib1=fib(n-1,qb);
        int fib2=fib(n-2,qb);
        int fibn=fib1+fib2;

        qb[n]=fibn;
        return fibn;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fib(n,new int[n+1]));

    }
}
