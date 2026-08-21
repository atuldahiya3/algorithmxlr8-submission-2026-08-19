import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res=0;
        while(n>0){
            n--;
            res++;
            if(res%m==0) n++;
        }
        System.out.println(res);
        return;
        // Write your solution here.
        // Simulate wearing one sock per day, gaining one more every m-th day.
        // Print the number of days Vasya successfully wears a sock.
    }
}
