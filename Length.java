import java.util.*;
public class Length {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int l;
        System.out.print("Enter a sentence:");
        s=sc.nextLine();
        l=s.length();
        System.out.println("Length of sentence is:"+l);
    }
}
