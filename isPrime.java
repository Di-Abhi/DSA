import java.util.*;
public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for (int div=2;div*div<=n;div++){
            if(n%div==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}

