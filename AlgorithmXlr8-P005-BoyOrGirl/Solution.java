import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        HashSet<Character> set= new HashSet<>();
        for(char c: name.toCharArray()){
            set.add(c);
        }
        if(set.size()%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");

        return;
        // Write your solution here.
        // Print "IGNORE HIM!" if the count of distinct letters is odd,
        // otherwise print "CHAT WITH HER!".
    }
}
