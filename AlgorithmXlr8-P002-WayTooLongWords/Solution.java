import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            int len=word.length();
            if(len<=10){
                System.out.println(word);
            }else{
                StringBuilder sb= new StringBuilder();
                sb.append(word.charAt(0));
                sb.append(String.valueOf(len-2));
                sb.append(word.charAt(len-1));
                System.out.println(sb.toString());
            }
            // Write your solution here.
            // If word length is more than 10, print the first letter, the count
            // of the middle letters, and the last letter, joined together.
            // Otherwise print the word unchanged.
        }
        return;
    }
}
