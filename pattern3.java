import java.util.*;
public class pattern3 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int a=4;
        int b=5;
        System.out.println(max(a,b));
        System.out.println(isEven(b));

    }
}
