import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res=0;
        for (int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<3;j++){
                int temp=sc.nextInt();
                if(temp==1) count++;
            }
            if(count>=2) res++;
        }
        System.out.println(res);
        return;
        // Write your solution here.
        // Count how many of the n problems have at least 2 of their 3 opinions equal to 1.
    }
}
